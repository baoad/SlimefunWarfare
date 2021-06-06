package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Guns {

    private Guns() {}

    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7手枪",
        "",
        "&7射程较短",
        "&7装填速度快.",
        "&7用于近距离战斗.",
        "&c射程:10",
        "&c伤害:3生命",
        "&c冷却时间:0.5秒"
    );

    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7左轮手枪",
        "",
        "&7射程较短",
        "&7装填速度较快.",
        "&7用于近距离战斗.",
        "&c射程:10",
        "&c伤害:3生命",
        "&c冷却时间:0.3秒"
    );

    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7机枪",
        "",
        "&7嘭~嘭~嘭",
        "&c射程:30",
        "&c最小射程:5",
        "&c伤害:3生命",
        "&c冷却时间:0.15秒"
    );

    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7微型枪",
        "",
        "&7终极武器",
        "&7朋友快乐机.",
        "&c射程:40",
        "&c最小射程:5",
        "&c伤害:4生命",
        "&c冷却时间:0秒"
    );

    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步枪",
        "",
        "&7标准步枪.",
        "&c射程:40",
        "&c最小射程:5",
        "&c伤害:4生命",
        "&c射击简断:0.75秒"
    );

    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7猎枪",
        "",
        "&7射程较短",
        "&7伤害高于步枪.",
        "&c射程:25",
        "&c最小射程:5",
        "&c伤害:6.5生命",
        "&c冷却时间:1.25秒"
    );

    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突击步枪",
        "",
        "&7步枪的衍生物",
        "&7拥有更好的性能",
        "&7标准步枪",
        "&7军用武器.",
        "&c射程:50",
        "&c最小射程:3",
        "&c伤害:6.5生命",
        "&c冷却时间:0.3时间"
    );

    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙击步枪",
        "",
        "&7他的射程非常长",
        "&7拥有很高的伤害.",
        "&c射程:130",
        "&c最小射程:50",
        "&c伤害:11生命",
        "&c冷却时间:8秒"
    );

    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&e电力步枪",
        "",
        "&7不用携带子弹!",
        "&c每发5J",
        "&c射程:100",
        "&c伤害:10生命",
        "&c间隔时间:0.2秒",
        LoreBuilder.powerCharged(0, 2500),
        "&e注:子弹看上去射出了一点",
        "&e其实你击中的目标"
    );
}
