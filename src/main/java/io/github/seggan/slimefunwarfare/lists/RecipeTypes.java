package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import io.github.seggan.slimefunwarfare.lists.items.Items;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;

@UtilityClass
public final class RecipeTypes {

    public static final RecipeType ELEMENT_FORGE = new RecipeType(
        SlimefunWarfare.inst().getKey("element_forge"),
        Items.ELEMENT_FORGE,
        "&c元素锻造机",
        "&7在此机器中制造"
    );

    public static final RecipeType SPACE = new RecipeType(
        SlimefunWarfare.inst().getKey("space"),
        new CustomItem(
            Material.NETHER_STAR,
            "&f另世界",
            "&7要在液氧世界中获取"
        )
    );

    public static final RecipeType AIR_LIQUEFIER = new RecipeType(
        SlimefunWarfare.inst().getKey("air_liquefier"),
        Items.AIR_LIQUEFIER
    );

    public static final RecipeType BULLET_PRESS = new RecipeType(
        SlimefunWarfare.inst().getKey("bullet_factory"),
        Items.BULLET_PRESS
    );

    public static final RecipeType EXPLOSIVE_SYNTHESIZER = new RecipeType(
        SlimefunWarfare.inst().getKey("explosive_synthesizer"),
        Items.EXPLOSIVE_SYNTHESIZER
    );

    public static final RecipeType BOOMINATOR = new RecipeType(
        SlimefunWarfare.inst().getKey("boominator_9000"),
        Items.BOOMINATOR_9000
    );
}
