package app.aizen.aion.data.classic.item;

public enum ItemType {

    WEAPON,
    ARMOR,
    ACCESSORY,
    MAGICSTONE,
    HOLYSTONE,
    BUNDLE;

    @Override
    public String toString() {
        return StringUtils.snakeCaseToCamelCase(name());
    }

}
