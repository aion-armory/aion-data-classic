package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.StringUtils;

public enum WeaponAttackType {

    PHYSICAL,
    MAGICAL_FIRE,
    MAGICAL_WATER,
    MAGICAL_EARTH,
    MAGICAL_AIR;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
