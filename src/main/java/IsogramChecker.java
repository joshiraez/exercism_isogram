import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        return phrase.chars()
                .noneMatch(
                        examiningLetterForDuplicate ->
                            phrase.chars()
                                .filter(possibleSameLetter ->
                                        possibleSameLetter == examiningLetterForDuplicate)
                                .count() > 1
                );

    }

}
