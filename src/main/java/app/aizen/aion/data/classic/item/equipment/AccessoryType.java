package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.StringUtils;

public enum AccessoryType implements EquipmentType {

    HEADGEAR,
    NECKLACE,
    EARRING,
    RING,
    BELT,
    NO_ACCESSORY;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
