package app.aizen.aion.data.classic.item;

import java.util.Arrays;

public enum ItemQuality {

    COMMON,
    RARE,
    LEGEND,
    UNIQUE,
    EPIC,
    MYTHIC,
    FINALITY,
    DIVINITY,
    JUNK;

    public static ItemQuality from(String name) {
        return Arrays.stream(ItemQuality.values())
                .filter(itemQuality -> itemQuality.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid item quality: " + name));
    }

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
