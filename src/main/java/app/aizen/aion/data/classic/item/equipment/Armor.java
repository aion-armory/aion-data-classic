package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.ItemType;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Armor extends Equipment {

    public Armor(EquipmentSlotType slot) {
        super(slot);
        this.type = ItemType.ARMOR;
    }
}
