import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        String clean = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = clean.length() - 1;

        while(left < right) {

            if(clean.charAt(left) != clean.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
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
