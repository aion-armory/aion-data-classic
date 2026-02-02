package app.aizen.aion.data.classic.skill;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuppressWarnings("unused")
public final class SkillEffect {

    private String type;
    private Map<String, Object> values;

    public SkillEffect(String type, Map<String, Object> values) {
        this.type = type;
        this.values = values;
    }

}
