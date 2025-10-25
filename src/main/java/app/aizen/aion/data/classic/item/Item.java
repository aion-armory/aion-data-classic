package app.aizen.aion.data.classic.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {

    private int id;
    private String stringId;
    private int level;
    private String icon;
    private String name;
    private ItemRank rank;
    private ItemQuality quality;
    private ItemPrice price;
    protected ItemType type;

}
