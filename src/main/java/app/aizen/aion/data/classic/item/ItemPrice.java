package app.aizen.aion.data.classic.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class ItemPrice {

    private String abyssItem;
    private int abyssItemCount;
    private int abyssPoint;

    private String extraCurrencyItem;
    private int extraCurrencyItemCount;

    private int tradeInAbyssPoint;
    private Map<String, Integer> tradeInItems;

    public boolean isEmpty() {
        return abyssItemCount == 0 && extraCurrencyItemCount == 0 && tradeInAbyssPoint == 0 && abyssPoint == 0
                && extraCurrencyItem == null && abyssItem == null && tradeInItems == null;
    }

}
