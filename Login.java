 import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "1234";
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access Granted");
                return;  
            } else {
                attempts++;
                System.out.println("Wrong Password");
            }
        }

        System.out.println("Account Blocked");
    }
}