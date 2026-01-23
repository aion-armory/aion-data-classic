package app.aizen.aion.data.classic.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CombatPowerRule {

    private CombatPowerType type;
    private String value;
    private int points;

}
