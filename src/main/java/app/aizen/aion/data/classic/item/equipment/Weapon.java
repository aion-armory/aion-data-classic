package app.aizen.aion.data.classic.item.equipment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Weapon extends Equipment {

    private int minDamage;
    private int maxDamage;

    private int baseAttackSpeed;
    private WeaponAttackType weaponAttackType;
    private int hitCount;

    public Weapon(EquipmentSlotType slot) {
        super(slot);
    }

    public void damageRange(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

}
