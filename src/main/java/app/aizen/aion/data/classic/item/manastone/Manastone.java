package app.aizen.aion.data.classic.item.manastone;

import app.aizen.aion.data.classic.item.Item;
import app.aizen.aion.data.classic.item.ItemType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Manastone extends Item {

    private String enchantType;
    private int enchantValue;

    public Manastone() {
        this.type = ItemType.MAGICSTONE;
    }
}
