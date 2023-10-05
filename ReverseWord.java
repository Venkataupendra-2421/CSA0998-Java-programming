import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Check if the input is a string
        if (isValidString(input)) {
            String reversedWord = reverseWord(input);
            System.out.println("Reverse String: " + reversedWord);
        } else {
            System.out.println("Invalid input. Please enter a string.");
        }

        scanner.close();
    }

    public static boolean isValidString(String input) {
        // Check if the input is not empty and contains only letters
        return !input.isEmpty() && input.matches("[a-zA-Z]+");
    }

    public static String reverseWord(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }

        // Convert the character array back to string
        return new String(charArray);
    }
}
