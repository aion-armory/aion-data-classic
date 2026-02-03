package app.aizen.aion.data.classic.skill;

import app.aizen.aion.data.classic.character.CharacterClass;
import app.aizen.aion.data.classic.character.Race;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public class CharacterSkill {

    private CharacterClass characterClass;
    private CharacterSkillType characterSkillType;
    private Race race;
    private int level;
    private int skillLevel;
    private Skill skill;
    private SkillCost cost;
    private List<SkillEffect> effects;
    private Map<String, Object> localizationPlaceholders;

}