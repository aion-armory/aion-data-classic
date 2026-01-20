package app.aizen.aion.data.classic.item.disassembly;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class DisassemblyReward {

    private int rate;
    private List<DisassemblyRewardItem> rewards;

}
