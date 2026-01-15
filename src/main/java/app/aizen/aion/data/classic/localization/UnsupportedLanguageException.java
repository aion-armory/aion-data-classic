package app.aizen.aion.data.classic.localization;

import java.util.Arrays;

public class UnsupportedLanguageException extends RuntimeException {

    public UnsupportedLanguageException(String code) {
        super("Unsupported language: " + code + ". Available values: " +
                Arrays.stream(Language.values()).map(Language::getCode).toList());
    }

}
