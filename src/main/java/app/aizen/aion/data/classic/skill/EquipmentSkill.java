package app.aizen.aion.data.classic.skill;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public class EquipmentSkill {

    private int id;
    private String name;
    private List<EnchantProbability> enchant;

}
