package app.aizen.aion.data.classic.skill.base;

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
public class Skill implements LocalizableEntity {

    private int id;
    private String stringId;
    private String name;
    private String description;
    private String type;
    private String subType;
    private String category;
    private String activation;
    private String target;
    private String icon;
    private int delay;
    private List<SkillEffect> effects;

    @Override
    public Collection<LocalizationKey> localizationKeys() {
        return List.of(
                new LocalizationKey(LocalizationField.NAME, name),
                new LocalizationKey(LocalizationField.DESCRIPTION, description)
        );
    }

}
