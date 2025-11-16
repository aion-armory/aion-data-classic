package app.aizen.aion.data.classic.skill.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class SkillEffect {

    private String type;
    private List<String> effects = new ArrayList<>();

}
