package app.aizen.aion.data.classic.item.bundle;

import app.aizen.aion.data.classic.item.Item;
import app.aizen.aion.data.classic.item.ItemType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@SuppressWarnings("unused")
public class Bundle extends Item {

    private boolean selectable;

    public Bundle() {
        this.type = ItemType.BUNDLE;
    }

}
