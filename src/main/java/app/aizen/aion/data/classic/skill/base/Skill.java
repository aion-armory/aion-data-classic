package app.aizen.aion.data.classic.skill.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Skill {

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

}
