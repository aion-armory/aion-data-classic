package app.aizen.aion.data.classic.character;

import java.util.Arrays;

public enum Race {

    ELYOS("pc_light"),
    ASMODIAN("pc_dark"),
    ALL("all");

    private final String value;

    Race(String value) {
        this.value = value;
    }

    public static Race from(String value) {
        return Arrays.stream(Race.values())
                .filter(r -> r.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(value + " is not a valid race"));
    }

}
