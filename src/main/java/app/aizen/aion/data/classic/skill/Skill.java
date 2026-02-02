package app.aizen.aion.data.classic.skill;

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
@SuppressWarnings("unused")
public class Skill implements LocalizableEntity {

    private int id;
    private String stringId;
    private String name;
    private String icon;
    private String description;

    private String groupName;
    private int groupLevel;

    private SkillActivation activation;

    private SkillCost cost;

    private Integer delayTime;

    private SkillTarget target;
    private Integer targetDistance;

    private SkillCasting casting;
    private Integer castingDelay;

    private List<Map<String, String>> effects; //temp filed for debugging

    @Override
    public Collection<LocalizationKey> localizationKeys() {
        return List.of(
                new LocalizationKey(LocalizationField.NAME, name),
                new LocalizationKey(LocalizationField.DESCRIPTION, description)
        );
    }

}
