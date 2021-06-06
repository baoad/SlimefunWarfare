package io.github.seggan.slimefunwarfare.lists.items;

import io.github.seggan.slimefunwarfare.lists.Heads;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Color;
import org.bukkit.Material;

public final class Items {

    private Items() {}

    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a钢锭",
        "",
        "这种合金虽硬但有弹性",
        "适合各种物品",
        ""
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a加强钢锭",
        "",
        "这种合金虽硬但有弹性",
        "适合各种物品",
        ""
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄具"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7枪口"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7加长枪口"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7子弹制造机",
        "",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&b液态空气制造机",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4爆炸物合成器",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack BOOMINATOR_9000 = new SlimefunItemStack(
        "BOOMINATOR_9000",
        Material.SMITHING_TABLE,
        "&4浓缩铀制造机 9000",
        "",
        "&7制造核弹用铀",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7铁子弹",
        "",
        "&7x0.75口径"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7铅子弹",
        "",
        "&7x口径"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&a铜子弹",
        "",
        "&7点燃被命中实体",
        "&7x1.5口径"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6金子弹",
        "",
        "&7x2口径"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6钢子弹",
        "",
        "&7点燃被命中实体",
        "&7x2.75口径"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7枪械枪身",
        "",
        "&7制造枪的必要材料"
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9锇矿",
        "",
        "&7稀有金属锇的来源"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9锇粉",
        "",
        "&7剧毒!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9锇锭",
        "",
        "&7在另一世界发现超强金属"
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9锇合金",
        "",
        "&7",
        "&7最坚硬,坚韧的材料"
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7混合矿",
        "",
        "&7稀有粉末混合粉的来源"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&b混合粉末",
        "",
        "&7潜力极大",
        ""
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&b能量整流器",
        "",
        "&7将点转换为纯能量"
    );

    public static final SlimefunItemStack UNPATENTABLIUM = new SlimefunItemStack(
        "UNPATENTABLIUM",
        Material.LIGHT_BLUE_DYE,
        "&bUnpatentablium",
        "",
        "&7For some reason, the",
        "&7Feds wouldn't let you",
        "&7patent this powerful",
        "&7power source",
        "无用物品 或将在以后开放"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6动力套装发电机组",
        "",
        "&7用于动力套",
        "&7给动力服装提供电力",
        ""
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&c元素锻造机",
        "",
        "&7用于创建新元素",
        "&c多方块结构"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        Heads.SUIT_HELMET,
        "&4动力头盔",
        "",
        "&7一件威力强大的盔甲",
        "&7可用来增加模块.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4动力胸甲",
        "",
        "&7一件威力强大的盔甲",
        "&7可用来增加模块.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4动力护腿",
        "",
        "&7一件威力强大的盔甲",
        "&7可用来增加模块.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4动力靴子",
        "",
        "&7一件威力强大的盔甲",
        "&7可用来增加模块.",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&f模块装填机",
        "",
        "&7允许你安装,卸载",
        "&7和查看模块"
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        Heads.MODULE,
        "&6模块外壳"
    );
}
