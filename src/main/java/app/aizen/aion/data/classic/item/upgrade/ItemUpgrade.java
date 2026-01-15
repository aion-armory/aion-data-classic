package app.aizen.aion.data.classic.item.upgrade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class ItemUpgrade {

    private int id;
    private String stringId;
    private String itemStringId;

    private int minEnchantValue;
    private int maxEnchantValue;

    private boolean skillTransfer;
    private boolean manastonesTransfer;
    private boolean godstoneTransfer;
    private boolean newGemstoneTransfer; //what is this?

    private List<ItemUpgradeVariant> variants = new ArrayList<>();

}
