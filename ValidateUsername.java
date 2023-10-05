import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the user name: ");
        String username1 = scanner.nextLine();
        System.out.print("Reenter the user name: ");
        String username2 = scanner.nextLine();

        // Check if the entered user names match and meet the criteria
        if (isValidUsername(username1, username2)) {
            System.out.println("User name is Valid");
        } else {
            System.out.println("User name is Invalid");
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username1, String username2) {
        // Check if the user names match and contain at least one digit and one special character
        return username1.equals(username2) && username1.matches(".*\\d.*") && username1.matches(".*[!@#$%^&*()].*");
    }
}
