package app.aizen.aion.data.classic.item.upgrade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class ItemUpgradeVariant {

    private List<ItemUpgradeResult> results = new ArrayList<>();
    private List<ItemUpgradeMaterial> materials = new ArrayList<>();
    private int qina;
    private int abyssPoints;

}
