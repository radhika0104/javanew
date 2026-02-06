package ifelseandloops;
import java.util.Scanner;
public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "user";
        String correctPassword = "9876";
        int attempts = 0;
        boolean isLoggedIn = false;
        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
                isLoggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong username or password");
                if (attempts < 3) {
                    System.out.println("Attempts left: " + (3 - attempts));
                }
            }
        }
        if (!isLoggedIn) {
            System.out.println("Account is locked after many incorrect attempts");
        }
//        sc.close();
    }
}
