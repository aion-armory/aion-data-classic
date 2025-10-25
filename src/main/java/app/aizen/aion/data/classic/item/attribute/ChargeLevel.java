package app.aizen.aion.data.classic.item.attribute;

import lombok.Getter;

@Getter
public enum ChargeLevel {

    ONE(1),
    TWO(2);

    private final int value;

    ChargeLevel(int value) {
        this.value = value;
    }

}
