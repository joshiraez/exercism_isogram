class IsogramChecker {

    boolean isIsogram(String phrase) {

        final String phraseNormalized = removeHyphensAndSpaces(phrase);

        return isTheSameLengthAfterRemovingDuplicatedLetters(phraseNormalized);


    }

    private boolean isTheSameLengthAfterRemovingDuplicatedLetters(final String phraseNormalized) {
        return phraseNormalized.chars()
                .distinct()
                .count() == phraseNormalized.length();
    }

    private String removeHyphensAndSpaces(final String phrase) {
        return phrase.toLowerCase()
                .replace("-", "")
                .replace(" ", "");
    }

}
