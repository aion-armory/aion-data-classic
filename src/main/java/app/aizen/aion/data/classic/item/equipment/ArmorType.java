package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.StringUtils;

public enum ArmorType implements EquipmentType {

    CLOTHES,
    ROBE,
    LEATHER,
    CHAIN,
    PLATE,
    SHIELD,
    WING,
    HEADGEAR,
    NO_ARMOR;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
