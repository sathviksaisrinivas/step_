import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        String reverse = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println(isPalindrome(text));

        sc.close();
    }
}
