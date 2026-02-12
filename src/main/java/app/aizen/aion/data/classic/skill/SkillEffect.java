package app.aizen.aion.data.classic.skill;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public final class SkillEffect {

    private int index;
    private String type;
    private Map<String, String> values;

}
