package app.aizen.aion.data.classic.item.godstone;

import app.aizen.aion.data.classic.item.Item;
import app.aizen.aion.data.classic.item.ItemType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Godstone extends Item {

    private int combatPower;

    public Godstone() {
        this.type = ItemType.HOLYSTONE;
    }

}
