package app.aizen.aion.data.classic.localization;

import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Stream;

@Getter
public enum Language {

    KOREAN("ko", "kor"),
    RUSSIAN("ru", "rus"),
    ENGLISH("en", "enu");

    private final String code;
    private final String l10n;

    Language(String code, String l10n) {
        this.code = code;
        this.l10n = l10n;
    }

    public static Language findByCode(String code) {
        return stream()
                .filter(language -> language.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new UnsupportedLanguageException(code));
    }

    public static Language findByL10N(String l10n) {
        return stream()
                .filter(language -> language.l10n.equalsIgnoreCase(l10n))
                .findFirst()
                .orElseThrow(() -> new UnsupportedLanguageException(l10n));
    }

    public static Stream<Language> stream() {
        return Arrays.stream(Language.values());
    }

}
