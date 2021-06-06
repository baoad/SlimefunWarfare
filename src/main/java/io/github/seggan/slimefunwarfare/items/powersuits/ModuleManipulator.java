package io.github.seggan.slimefunwarfare.items.powersuits;

import io.github.mooy1.infinitylib.slimefun.AbstractContainer;
import io.github.seggan.slimefunwarfare.lists.Categories;
import io.github.seggan.slimefunwarfare.lists.Heads;
import io.github.seggan.slimefunwarfare.lists.items.Items;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class ModuleManipulator extends AbstractContainer {

    private static final int[] BACKGROUND = new int[]{0, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 18, 19, 20, 21, 22, 27, 29, 31, 36, 38, 39, 40, 41, 42, 43, 44};
    private static final int[] BORDER = new int[]{14, 15, 16, 17, 23, 26, 32, 33, 34, 35};
    private static final int[] OUTPUT_SLOTS = new int[]{24, 25};

    private static final int INSTALLED = 3;
    private static final int INSTALL = 30;

    private static final int SUIT_MARKER = 1;
    private static final int SUIT = 10;

    private static final int MODULE_MARKER = 28;
    private static final int MODULE = 37;

    public ModuleManipulator() {
        super(Categories.POWER_SUITS, Items.MODULE_MANIPULATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            null, Items.MODULE_CASE, null,
            Items.SEGGANESSON, new ItemStack(Material.CRAFTING_TABLE), Items.SEGGANESSON,
            null, Items.OSMIUM_INGOT, null
        });
    }

    @Override
    protected void setupMenu(@Nonnull BlockMenuPreset preset) {
        preset.drawBackground(BACKGROUND);

        for (int i : BORDER) {
            preset.addItem(i, ChestMenuUtils.getOutputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        preset.addItem(INSTALL, new CustomItem(
            Material.REDSTONE,
            "安装/卸载模块"
        ));

        preset.addItem(INSTALLED, new CustomItem(
            Material.BOOK,
            "&f已安装的模块(单击以刷新)"
        ));

        preset.addItem(SUIT_MARKER, new CustomItem(
            SkullItem.fromBase64(Heads.SUIT_HELMET),
            "&4把动力套装放在这里"
        ), ChestMenuUtils.getEmptyClickHandler());

        preset.addItem(MODULE_MARKER, new CustomItem(
            SkullItem.fromBase64(Heads.MODULE),
            "&6把模块放在这里"
        ), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
        menu.addMenuClickHandler(INSTALLED, (p, slot, item, action) -> {
            refresh(menu);
            return false;
        });
        menu.addMenuClickHandler(INSTALL, (p, slot, item, action) -> {
            install(menu);
            return false;
        });
    }

    private void install(@Nonnull BlockMenu menu) {
        ItemStack stack = menu.getItemInSlot(SUIT);
        SlimefunItem slimefunItem = SlimefunItem.getByItem(stack);
        if (!(slimefunItem instanceof PowerSuit)) return;
        PowerSuit powerSuit = (PowerSuit) slimefunItem;

        slimefunItem = SlimefunItem.getByItem(menu.getItemInSlot(MODULE));
        if (slimefunItem instanceof Module.ModuleItem) {
            Module.ModuleItem module = (Module.ModuleItem) slimefunItem;

            if (module.getModule().getAllowed() == null || module.getModule().getAllowed() == powerSuit.getType()) {
                PowerSuit.addModule(stack, module.getModule());

                menu.pushItem(stack, OUTPUT_SLOTS);
                menu.consumeItem(SUIT);
                menu.consumeItem(MODULE);
            }
        } else {
            Module module = PowerSuit.popModule(stack);

            menu.pushItem(stack, OUTPUT_SLOTS);
            menu.consumeItem(SUIT);

            if (module != null) {
                menu.pushItem(module.getItem().clone(), OUTPUT_SLOTS);
            }
        }
    }

    private void refresh(@Nonnull BlockMenu menu) {
        ItemStack stack = menu.getItemInSlot(SUIT);
        if (!(SlimefunItem.getByItem(stack) instanceof PowerSuit)) return;

        Module[] modules = PowerSuit.getModules(stack);

        ItemStack book = menu.getItemInSlot(INSTALLED);
        ItemMeta meta = book.getItemMeta();
        List<String> lore = meta.getLore();
        lore = lore == null ? new ArrayList<>() : lore;
        lore.clear();

        for (Module module : modules) {
            lore.add(module.getItem().getDisplayName());
        }

        meta.setLore(lore);
        book.setItemMeta(meta);
    }

    @Nonnull
    @Override
    protected int[] getTransportSlots(@Nonnull DirtyChestMenu menu, @Nonnull ItemTransportFlow flow, ItemStack item) {
        if (flow == ItemTransportFlow.WITHDRAW) {
            return OUTPUT_SLOTS;
        }

        return new int[0];
    }
}
