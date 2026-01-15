package app.aizen.aion.data.classic.item;

import app.aizen.aion.data.classic.localization.LocalizableEntity;

import app.aizen.aion.data.classic.localization.LocalizationField;
import app.aizen.aion.data.classic.localization.LocalizationKey;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@ToString
public class Item implements LocalizableEntity {

    private int id;
    private String stringId;
    private String description;
    private int level;
    private String icon;
    private String name;
    private ItemRank rank;
    private ItemQuality quality;
    private ItemPrice price;
    protected ItemType type;
    private boolean canBeUpgraded;

    @Override
    public Collection<LocalizationKey> localizationKeys() {
        return List.of(
                new LocalizationKey(LocalizationField.NAME, name),
                new LocalizationKey(LocalizationField.DESCRIPTION, description)
        );
    }

}
