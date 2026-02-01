package app.aizen.aion.data.classic.skill.base;

import app.aizen.aion.data.classic.localization.LocalizableEntity;
import app.aizen.aion.data.classic.localization.LocalizationField;
import app.aizen.aion.data.classic.localization.LocalizationKey;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Skill implements LocalizableEntity {

    private int id;
    private String stringId;
    private String name;
    private String description;
    private String type;
    private String subType;
    private String category;
    private String chainCategory;
    private Integer chainCategoryLevel;
    private Integer repeat;
    private String groupName;
    private String activation;
    private String costUnit;
    private Integer costValue;
    private Integer costStepPerLevel;
    private Integer delayType;
    private Integer delayTime;
    private String target;
    private Integer targetDistance;
    private String icon;
    private Boolean moveCasting;
    private Integer castingDelay;
    private List<Map<String, String>> effects;

    @Override
    public Collection<LocalizationKey> localizationKeys() {
        return List.of(
                new LocalizationKey(LocalizationField.NAME, name),
                new LocalizationKey(LocalizationField.DESCRIPTION, description)
        );
    }

}
