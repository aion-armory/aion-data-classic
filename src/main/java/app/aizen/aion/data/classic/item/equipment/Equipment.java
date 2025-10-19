package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.*;
import app.aizen.aion.data.classic.item.attribute.Attributes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import static app.aizen.aion.data.classic.item.equipment.AccessoryType.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Equipment extends Item {

    private EquipmentSlotType slot;
    private int extraManastones;
    private Attributes attributes;
    private EquipmentType equipmentType;
    private int combatPowerPoints;

    public Equipment(EquipmentSlotType slot) {
        this.slot = slot;
        this.attributes = new Attributes();
    }

    public static Equipment create(EquipmentSlotType slot) {
        switch (slot) {
            case LEFT_HAND -> {
                return Equipment.createArmor(slot, ArmorType.SHIELD);
            }
            case HEAD -> {
                return Equipment.createArmor(slot, ArmorType.HEADGEAR);
            }
            case WING -> {
                return Equipment.createArmor(slot, ArmorType.WING);
            }
            case TORSO, GLOVE, SHOULDER, LEG, FOOT -> {
                return Equipment.createArmor(slot, null);

            }
            case RIGHT_HAND_OR_LEFT_HAND, RIGHT_HAND -> {
                return Equipment.createWeapon(slot, null);

            }
            case EAR, NECK, WAIST, FINGER -> {
                return Equipment.createAccessory(slot);
            }
            default -> {
                return null;
            }
        }
    }

    public static Weapon createWeapon(EquipmentSlotType slot, WeaponType weaponType) {
        Weapon weapon = new Weapon(slot);
        weapon.setEquipmentType(weaponType);

        return weapon;
    }

    public static Armor createArmor(EquipmentSlotType slot, ArmorType armorType) {
        Armor armor = new Armor(slot);
        armor.setEquipmentType(armorType);

        return armor;
    }

    public static Accessory createAccessory(EquipmentSlotType slot) {
        Accessory accessory = new Accessory(slot);

        AccessoryType accessoryType = NO_ACCESSORY;
        switch (slot) {
            case NECK -> accessoryType = NECKLACE;
            case EAR -> accessoryType = EARRING;
            case FINGER -> accessoryType = RING;
            case WAIST -> accessoryType = BELT;
        }
        accessory.setEquipmentType(accessoryType);

        return accessory;
    }

}
