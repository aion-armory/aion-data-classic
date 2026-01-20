package app.aizen.aion.data.classic.item.disassembly;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@SuppressWarnings("unused")
public class DisassemblyItem {

    private int itemId;
    private List<DisassemblyReward> disassemblyRewards;

}