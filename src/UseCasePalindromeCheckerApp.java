import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static boolean isPalindrome(String str){

        String clean = str.replaceAll("\\s+","").toLowerCase();

        String reverse = new StringBuilder(clean).reverse().toString();

        return clean.equals(reverse);
    }

    public static void main(String[] args){

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
