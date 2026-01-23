package app.aizen.aion.data.classic.game;

import app.aizen.aion.data.classic.item.StringUtils;
import lombok.Getter;

@Getter
public enum CombatPowerType {

    ENCHANT_COUNT,
    ITEM_QUALITY,
    ITEM_LEVEL,
    ENCHANT_OPTION,
    SKILL,
    MOROS_LEVEL,
    CHARACTER_LEVEL,
    CHARACTER_EXP,
    ADDITIONAL_OPTION,
    TITLE;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }
}
