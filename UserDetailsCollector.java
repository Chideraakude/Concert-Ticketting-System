import java.util.Scanner;

public class UserDetailsCollector {

    static Scanner obtain = new Scanner(System.in);

    static String[] usernames = new String[20];
    static String[] emails = new String[20];
    static String[] passwords = new String[20];

    static int userCounter = 0;

    public static void signupDetails() {

        if (userCounter >= 20) {
            System.out.println("User storage is full!");
            return;
        }

        System.out.print("Enter Username: ");
        usernames[userCounter] = obtain.nextLine();

        System.out.print("Enter Email: ");
        emails[userCounter] = obtain.nextLine();

        System.out.print("Enter Password: ");
        passwords[userCounter] = obtain.nextLine();

        userCounter++;

        System.out.println("User registered successfully!");
    }
}
