package app.aizen.aion.data.classic.item;

public enum ItemType {

    WEAPON,
    ARMOR,
    ACCESSORY;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
