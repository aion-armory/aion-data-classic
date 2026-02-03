package app.aizen.aion.data.classic.skill;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SkillCost {

    private String unit;
    private Integer value;

    public boolean noCost() {
        return (value == null || value == 0);
    }

}
