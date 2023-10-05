
public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0,
                vowels = 0,
                letters = 0;

        // Iterate through each character in the text
        for (char ch : text.toCharArray()) {
            // Check if the character is a letter (alphabetical character)
            if (Character.isLetter(ch)) {
                letters++;
                // Check if the letter is a vowel (ignoring case)
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels++;
                }
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n"
                + "spaces: " + spaces);
    }
}
