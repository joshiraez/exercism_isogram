import java.util.function.IntPredicate;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        return phrase.chars()
                .noneMatch(
                        isTheLetterDuplicatedInPhrase(phrase)
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
