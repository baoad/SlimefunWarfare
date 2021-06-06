package io.github.seggan.slimefunwarfare.lists.items;

import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Explosives {

    private Explosives() {
    }

    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4易爆粉末",
        "",
        "&7非常容易爆炸"
    );

    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&f液态空气",
        "",
        "&7不要碰!"
    );

    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f液氮",
        "",
        "&7来根冰淇淋吗?"
    );

    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f净化液氮",
        "",
        "&7特别干净"
    );

    public static final SlimefunItemStack LIQUID_OXYGEN = new SlimefunItemStack(
        "LIQUID_OXYGEN",
        HeadTexture.TIN_CAN,
        "&f液氧",
        "",
        "&7清爽"
    );

    public static final SlimefunItemStack FLOX = new SlimefunItemStack(
        "FLOX",
        HeadTexture.TIN_CAN,
        "&f液氧传送轴",
        "",
        "&7燃料+液氧.右键进入",
        "&c请确保双击空格键",
        "&c传送以防止坠落"
    );

    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6硫代丙酮",
        "",
        "&7真的很臭"
    );

    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "",
        "&7手榴弹材料"
    );

    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e叠氮",
        "",
        "&7手榴弹材料"
    );

    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "",
        "&7手榴弹材料"
    );

    public static final SlimefunItemStack ENRICHED_URANIUM = new SlimefunItemStack(
        "ENRICHED_URANIUM",
        HeadTexture.BOOSTED_URANIUM,
        "&a浓缩铀"
    );

    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&f化学手榴弹",
        "",
        "&7类型:无"
    );

    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7增强混凝土",
        "",
        "&7防爆(非防爆破)混凝土"
    );

    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7核弹",
        "",
        "&7KABOOM!"
    );
}
