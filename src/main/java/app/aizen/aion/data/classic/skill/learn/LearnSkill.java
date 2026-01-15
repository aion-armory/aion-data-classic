package app.aizen.aion.data.classic.skill.learn;

import app.aizen.aion.data.classic.character.CharacterClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LearnSkill {

    private CharacterClass characterClass;
    private String race;
    private int level;
    private int skillLevel;
    private String name;
//    private boolean isStigma;
    private boolean autoLearn;

}
