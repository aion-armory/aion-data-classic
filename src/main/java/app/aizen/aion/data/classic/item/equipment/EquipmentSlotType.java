package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.StringUtils;

public enum EquipmentSlotType {

    RIGHT_HAND_OR_LEFT_HAND,
    RIGHT_HAND,
    LEFT_HAND,
    HEAD,
    WING,
    TORSO,
    LEG,
    FOOT,
    GLOVE,
    SHOULDER,
    NECK,
    EAR,
    FINGER,
    WAIST,
    BATTERY,
    NO_SLOT;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
