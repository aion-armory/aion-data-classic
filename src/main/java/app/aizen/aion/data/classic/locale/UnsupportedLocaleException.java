package app.aizen.aion.data.classic.locale;

import java.util.Arrays;

public class UnsupportedLocaleException extends RuntimeException {

    public UnsupportedLocaleException(String code) {
        super("Unsupported locale: " + code + ". Available values: " +
                Arrays.stream(Locale.values()).map(Locale::getCode).toList());
    }

}
