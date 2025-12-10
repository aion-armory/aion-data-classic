package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.StringUtils;

public enum WeaponType implements EquipmentType {

    SWORD,
    MACE,
    DAGGER,
    ORB,
    SPELLBOOK,
    GREATSWORD,
    POLEARM,
    STAFF,
    BOW,
    CHAINSWORD,
    DRAGON_CLAW,
    DIMENSIONAL_SWORD,
    RUNE_SWORD,
    GUN,
    NO_WEAPON;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
