
public class WordSorter {
    public static void main(String[] args) {
        // The text as a String
        String soliloquyText = "To be, or not to be, that is the question: "
                + "Whether 'tis nobler in the mind to suffer "
                + "The slings and arrows of outrageous fortune, "
                + "Or to take arms against a sea of troubles "
                + "And by opposing end them.";

        // Split the text into words using whitespace as the delimiter
        String[] words = soliloquyText.split("\\s+");

        // Sort the words using bubble sort
        bubbleSort(words);

        // Display the sorted words
        System.out.println("Sorted Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble sort implementation for sorting an array of Strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareToIgnoreCase(arr[i + 1]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

