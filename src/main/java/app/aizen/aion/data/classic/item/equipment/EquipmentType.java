package app.aizen.aion.data.classic.item.equipment;

import java.util.ArrayList;
import java.util.List;

public interface EquipmentType {

    static List<EquipmentType> values() {
        List<EquipmentType> equipmentTypes = new ArrayList<>();

        equipmentTypes.addAll(List.of(ArmorType.values()));
        equipmentTypes.addAll(List.of(WeaponType.values()));
        equipmentTypes.addAll(List.of(AccessoryType.values()));

        return equipmentTypes;
    }

}
