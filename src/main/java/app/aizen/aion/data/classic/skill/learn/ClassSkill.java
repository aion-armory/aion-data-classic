package app.aizen.aion.data.classic.skill.learn;

import app.aizen.aion.data.classic.character.CharacterClass;
import app.aizen.aion.data.classic.character.Race;
import app.aizen.aion.data.classic.skill.base.Skill;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public class ClassSkill {

    private CharacterClass characterClass;
    private Race race;
    private Skill skill;
    private int level;
    private int skillLevel;
    private List<SkillEffect> effects;
    private SkillType skillType;
    private Map<String, Object> localizationPlaceholders;
}
