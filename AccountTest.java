import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        // Create an Account object and assign it to myAccount
        Account myAccount = new Account();

        // Display the initial value of the name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // Prompt for and read the name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // Read a line of text
        myAccount.setName(theName); // Put theName in myAccount
        System.out.println(); // Outputs a blank line

        // Display the name stored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}
