package app.aizen.aion.data.classic.character;

import app.aizen.aion.data.classic.item.StringUtils;
import lombok.Getter;

@Getter
public enum CharacterClass {

    ALL(0, 0, 0, 0, 0, 0),
    WARRIOR(0, 0, 0, 0, 0, 0),
    SCOUT(0, 0, 0, 0, 0, 0),
    CLERIC(0, 0, 0, 0, 0, 0),
    MONK(0, 0, 0, 0, 0, 0),
    MAGE(0, 0, 0, 0, 0, 0),
    STRIKER(0, 0, 0, 0, 0, 0),
    FIGHTER(115, 115, 100,100,90,90),
    KNIGHT(115,100, 100, 100,90,105),
    RANGER(100, 100, 115, 115, 90, 90),
    ASSASSIN(110, 100, 110, 110, 90, 90),
    PRIEST(105, 110, 90, 90, 105, 110),
    CHANTER(110, 105, 90, 90, 105, 110),
    WIZARD(90, 90, 100, 100, 120, 110),
    ELEMENTALIST(90, 90, 100, 100, 115, 115),
    THUNDERER(115, 100, 105, 100, 90, 100),
    BATTLEMASTER(115, 115, 100, 100, 90, 90),
    LUMINES(90, 90, 100, 100, 120, 110),
    GUNNER(100, 105, 100, 105, 100, 100),
    RUNEBLADE(115, 115, 100, 100, 120, 110);

    private final int strength;
    private final int vitality;
    private final int agility;
    private final int dexterity;
    private final int knowledge;
    private final int will;

    CharacterClass(int strength, int vitality, int agility, int dexterity, int knowledge, int will) {
        this.strength = strength;
        this.vitality = vitality;
        this.agility = agility;
        this.dexterity = dexterity;
        this.knowledge = knowledge;
        this.will = will;
    }

    public static CharacterClass from(String name) {
        if (name.equalsIgnoreCase("ELEMENTALLIST")) {
            return ELEMENTALIST;
        }

        return CharacterClass.valueOf(name.toUpperCase());
    }

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
