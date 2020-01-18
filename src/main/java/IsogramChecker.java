import java.util.function.IntPredicate;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        final String phraseNormalized = phrase.toLowerCase()
                .replace("-", "")
                .replace(" ", "");

        return phraseNormalized.chars()
                .noneMatch(
                        isTheLetterDuplicatedInPhrase(phraseNormalized)
                );

    }

    private IntPredicate isTheLetterDuplicatedInPhrase(final String phrase) {

        return examiningLetterForDuplicate ->
            phrase.chars()
                .filter(possibleSameLetter ->
                        possibleSameLetter == examiningLetterForDuplicate)
                .count() > 1;
    }

}
