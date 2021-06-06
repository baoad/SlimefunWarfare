package io.github.seggan.slimefunwarfare.lists;

import io.github.mooy1.infinitylib.categories.MultiCategory;
import io.github.mooy1.infinitylib.categories.SubCategory;
import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;

@UtilityClass
public final class Categories {

    public static final Category GENERAL = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_general"),
        new CustomItem(Material.DIAMOND_SWORD, "材料")
    );

    public static final Category GUNS = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_guns"),
        new CustomItem(Material.CROSSBOW, "枪械")
    );

    public static final Category MELEE = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_melee"),
        new CustomItem(Material.IRON_AXE, "近战武器")
    );

    public static final Category EXPLOSIVES = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_explosives"),
        new CustomItem(Material.TNT, "炸药")
    );

    public static final Category RESOURCES = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_resources"),
        new CustomItem(Material.IRON_ORE, "资源")
    );

    public static final Category POWER_SUITS = new SubCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare_power_suits"),
        new CustomItem(SkullItem.fromBase64(Heads.SUIT_HELMET), "动力套装")
    );

    public static final Category MAIN = new MultiCategory(
        SlimefunWarfare.inst().getKey("slimefunwarfare"),
        new CustomItem(Material.DIAMOND_SWORD, "Slimefun Warfare(枪械工艺)"),
        GENERAL, GUNS, MELEE, EXPLOSIVES, RESOURCES, POWER_SUITS
    );

    public static void setup(SlimefunWarfare addon) {
        MAIN.register(addon);
    }
}
