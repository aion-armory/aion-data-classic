package app.aizen.aion.data.classic.item.equipment;

import app.aizen.aion.data.classic.item.ItemType;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class Weapon extends Equipment {

    private Integer minDamage;
    private Integer maxDamage;

    private Integer attackSpeed;
    private WeaponAttackType attackType;
    private Integer hitCount;

    private Integer attackRange;

    public Weapon(EquipmentSlotType slot) {
        super(slot);
        this.type = ItemType.WEAPON;
    }

    public void damageRange(Integer minDamage, Integer maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

}
