package app.aizen.aion.data.classic.item;

import java.util.Arrays;

public enum ItemRank {

    NORMAL,
    ABYSS,
    DRACONIC,
    DEVANION;

    public static ItemRank from(String name) {
        return Arrays.stream(ItemRank.values())
                .filter(itemRank -> itemRank.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid item rank: " + name));
    }

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
