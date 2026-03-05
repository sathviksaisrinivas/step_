import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if(isPalindrome(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
