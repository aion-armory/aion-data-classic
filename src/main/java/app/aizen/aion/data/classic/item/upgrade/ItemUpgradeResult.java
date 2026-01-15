package app.aizen.aion.data.classic.item.upgrade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemUpgradeResult {

    private ItemUpgradeResultType type;
    private int enchantValue;
    private int rate;
    private String stringId;
    private int count;

    public static ItemUpgradeResult fail() {
        ItemUpgradeResult result = new ItemUpgradeResult();
        result.type = ItemUpgradeResultType.FAIL;

        return result;
    }

    public static ItemUpgradeResult success() {
        ItemUpgradeResult result = new ItemUpgradeResult();
        result.type = ItemUpgradeResultType.SUCCESS;

        return result;
    }

    public static ItemUpgradeResult greatSuccess() {
        ItemUpgradeResult result = new ItemUpgradeResult();
        result.type = ItemUpgradeResultType.GREAT_SUCCESS;

        return result;
    }

    public boolean hasNoResult() {
        return count == 0;
    }

}
