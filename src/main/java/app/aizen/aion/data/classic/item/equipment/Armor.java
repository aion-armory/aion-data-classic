package app.aizen.aion.data.classic.item.equipment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Armor extends Equipment {

    public Armor(EquipmentSlotType slot) {
        super(slot);
    }
}
