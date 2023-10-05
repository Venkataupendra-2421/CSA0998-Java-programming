import java.util.Scanner;

public class EligibilityToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter your age: ");

        // Handle non-integer inputs
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age.");
            return;
        }

        // Check eligibility to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age >= 0) {
            int yearsLeft = 18 - age;
            System.out.println("You are allowed to vote after " + yearsLeft + " years.");
        } else {
            System.out.println("Invalid age. Please enter a non-negative age.");
        }

        // Test cases
        checkEligibility(25);
        checkEligibility("Eighteen");
        checkEligibility(12);
        checkEligibility(-18);
        checkEligibility(34.5);

        scanner.close();
    }

    public static void checkEligibility(Object input) {
        if (input instanceof Integer) {
            int age = (int) input;
            if (age >= 18) {
                System.out.println(age + " years: Eligible to vote.");
            } else if (age >= 0) {
                int yearsLeft = 18 - age;
                System.out.println(age + " years: You are allowed to vote after " + yearsLeft + " years.");
            } else {
                System.out.println("Invalid age: " + age);
            }
        } else {
            System.out.println("Invalid input: " + input);
        }
    }
}
