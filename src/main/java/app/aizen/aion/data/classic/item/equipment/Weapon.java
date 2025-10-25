package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.ItemType;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Weapon extends Equipment {

    private int minDamage;
    private int maxDamage;

    private int attackSpeed;
    private WeaponAttackType attackType;
    private int hitCount;

    public Weapon(EquipmentSlotType slot) {
        super(slot);
        this.type = ItemType.WEAPON;
    }

    public void damageRange(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

}
