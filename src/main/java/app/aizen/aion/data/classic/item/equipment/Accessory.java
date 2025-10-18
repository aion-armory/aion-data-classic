package app.aizen.aion.data.classic.item.equipment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Accessory extends Armor {

    public Accessory(EquipmentSlotType slot) {
        super(slot);
    }

}
