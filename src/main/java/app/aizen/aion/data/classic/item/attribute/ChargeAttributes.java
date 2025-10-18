package app.aizen.aion.data.classic.item.attribute;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class ChargeAttributes {

    private ChargeLevel chargeLevel;
    private Map<String, Integer> attributes;

}
