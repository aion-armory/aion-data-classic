package app.aizen.aion.data.classic.character;

import app.aizen.aion.data.classic.item.StringUtils;
import lombok.Getter;

@Getter
public enum CharacterClass {

    ALL,
    WARRIOR,
    SCOUT,
    CLERIC,
    MONK,
    MAGE,
    STRIKER,
    FIGHTER,
    KNIGHT,
    CHANTER,
    PRIEST,
    ASSASSIN,
    RANGER,
    WIZARD,
    ELEMENTALIST,
    THUNDERER,
    BATTLEMASTER,
    LUMINES,
    GUNNER,
    RUNEBLADE;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
