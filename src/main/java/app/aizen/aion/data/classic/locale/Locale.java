package app.aizen.aion.data.classic.locale;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Stream;

@Getter
public enum Locale {

    KOREAN("ko", "kor"),
    RUSSIAN("ru", "rus"),
    ENGLISH("en", "enu");

    private final String code;
    private final String l10n;

    Locale(String code, String l10n) {
        this.code = code;
        this.l10n = l10n;
    }

    public static Locale findByCode(String code) {
        return stream()
                .filter(locale -> locale.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new UnsupportedLocaleException(code));
    }

    public static Locale findByL10N(String l10n) {
        return stream()
                .filter(locale -> locale.l10n.equalsIgnoreCase(l10n))
                .findFirst()
                .orElseThrow(() -> new UnsupportedLocaleException(l10n));
    }

    public static Stream<Locale> stream() {
        return Arrays.stream(Locale.values());
    }

}
