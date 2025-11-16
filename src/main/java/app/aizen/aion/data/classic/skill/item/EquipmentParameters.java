package app.aizen.aion.data.classic.skill.item;

import app.aizen.aion.data.classic.item.ItemQuality;
import app.aizen.aion.data.classic.item.ItemRank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@Setter
@ToString
public class EquipmentParameters {

    private static final Map<String, ItemQuality> QUALITIES = Map.of(
            "e1_", ItemQuality.EPIC,
            "e2_", ItemQuality.EPIC
    );

    private static final Map<String, String> ARMOR = Map.of(
            "torso", "torso",
            "pants", "pants",
            "shoulder", "shoulder",
            "glove", "glove",
            "shoes", "shoes"
    );

    private ItemQuality quality;
    private ItemRank rank;
    private String armor;
    private int level;
    private String uniqueName;

    public static EquipmentParameters create(String name) {
        String cleanName = name.replaceAll("(?<=_)?(skill|All)_(?=\\w)", "");
        EquipmentParameters parameters = new EquipmentParameters();

        if (cleanName.contains("a_")) {
            if (cleanName.contains("wind")) {
                parameters.rank = ItemRank.DRACONIC;
            } else {
                parameters.rank = ItemRank.ABYSS;
            }
        }

        QUALITIES.forEach((key, value) -> {
            if (cleanName.contains(key)) {
                parameters.quality = value;
            }
        });

        ARMOR.forEach((key, value) -> {
            if (cleanName.contains(key)) {
                parameters.armor = value;
            }
        });

        Matcher m = Pattern.compile("(\\d{2})a$").matcher(cleanName);
        if (m.find()) {
            parameters.level = Integer.parseInt(m.group(1));
        }

        parameters.uniqueName = extractUniqueName(cleanName);

        return parameters;
    }

    private static String extractUniqueName(String name) {
        String result = name;

        result = result.replace("_a_", "_")
                .replace("_e1_", "_")
                .replace("_e2_", "_");

        for (String armor : ARMOR.keySet()) {
            result = result.replace(armor + "_", "_");
        }

        result = result.replaceAll("(\\d{2})a$", "");

        result = result.replaceAll("^_+|_+$", "");

        return result.isEmpty() ? "" : result;
    }

}
