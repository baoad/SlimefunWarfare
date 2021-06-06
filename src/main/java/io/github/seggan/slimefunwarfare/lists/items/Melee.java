package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public final class Melee {

    private Melee() {}

    public static final SlimefunItemStack ENERGY_BLADE = new SlimefunItemStack(
        "ENERGY_BLADE",
        Material.DIAMOND_SWORD,
        "&b动力刀刃",
        "",
        "&7可以认为他是\"光剑\",",
        "&7这把先进的见必须用纯净的能量",
        "&7非常的锋利",
        "",
        "&9每次使用5J",
        LoreBuilder.powerCharged(0, 2500),
        "",
        "&7在主手时:",
        "&214攻击伤害",
        "&21.6攻击速度"
    );

    public static final SlimefunItemStack BATTLE_AXE = new SlimefunItemStack(
        "BATTLE_AXE",
        Material.IRON_AXE,
        "&6&l战斧",
        "",
        "&7这把斧头专门为战场设计的!",
        "",
        "&7在主手时:",
        "&29攻击伤害",
        "&21.6攻击速度"
    );

    public static final SlimefunItemStack OSMIUM_SWORD = new SlimefunItemStack(
        "OSMIUM_SWORD",
        Material.IRON_SWORD,
        "&6锇剑",
        "",
        "&7非常的重",
        "",
        "&7在主手时:",
        "&210的伤害",
        "&21.6攻击速度"
    );

    public static final SlimefunItemStack DUMMY = new SlimefunItemStack(
        "DUMMY",
        Material.HUSK_SPAWN_EGG,
        "&f标靶蛋",
        "",
        "&7如果打到他,将会显示掉血数值",
        "&7右键放置.",
        "&7右键回收"
    );

    static {
        ENERGY_BLADE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);

        ItemMeta meta = ENERGY_BLADE.getItemMeta();
        meta.setUnbreakable(true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            13,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        ENERGY_BLADE.setItemMeta(meta);

        // Sets the attack speed to match that of a sword
        meta = BATTLE_AXE.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackSpeed",
            -2.4,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            8,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        BATTLE_AXE.setItemMeta(meta);

        OSMIUM_SWORD.addUnsafeEnchantment(Enchantment.DURABILITY, 8);

        meta = OSMIUM_SWORD.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            9,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        OSMIUM_SWORD.setItemMeta(meta);
    }
}
