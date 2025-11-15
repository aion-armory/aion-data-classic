package app.aizen.aion.data.classic.skill.item;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ItemSkill {

    private String itemName;
    private List<EnchantProbability> enchant;

}
