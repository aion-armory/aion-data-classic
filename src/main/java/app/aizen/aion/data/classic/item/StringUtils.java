package app.aizen.aion.data.classic.item;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {

    public static String snakeCaseToCamelCase(String str) {
        String[] words = str.split("_");
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.isEmpty()) {
                continue;
            }

            if (i == 0) {
                camelCase
                        .append(word.toLowerCase());
            } else {
                camelCase
                        .append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase());
            }
        }

        return camelCase.toString();
    }

    public static String camelCaseToSnakeCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                if (i != 0) {
                    result.append('_');
                }
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

}
