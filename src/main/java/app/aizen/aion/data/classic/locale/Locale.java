package app.aizen.aion.data.classic.locale;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Locale {

    KOREAN("ko"),
    RUSSIAN("ru"),
    ENGLISH("en");

    private final String code;

    Locale(String code) {
        this.code = code;
    }

    public static Locale find(String code) {
        return stream()
                .filter(locale -> locale.code().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new UnsupportedLocaleException(code));
    }

    public String code() {
        return code;
    }

    public static Stream<Locale> stream() {
        return Arrays.stream(Locale.values());
    }

}
