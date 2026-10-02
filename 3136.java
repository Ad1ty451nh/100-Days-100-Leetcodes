class Solution {
    public boolean isValid(String word) {
        
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));

            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
            }
           
            else if (Character.isLetter(c)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
