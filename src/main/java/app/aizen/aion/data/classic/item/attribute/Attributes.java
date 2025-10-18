package app.aizen.aion.data.classic.item.attribute;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Attributes {

    private Map<String, Integer> main;
    private Map<String, Integer> bonus;
    private List<ChargeAttributes> charge;

}
