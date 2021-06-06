package io.github.seggan.slimefunwarfare.items.powersuits;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ArmorPiece {
    HEAD("头盔"),
    CHEST("胸甲"),
    LEGS("护腿"),
    FEET("鞋子");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
