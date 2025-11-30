package app.aizen.aion.data.classic.skill.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class EquipmentSkill {

    private int id;
    private String name;
    private List<EnchantProbability> enchant;

}
