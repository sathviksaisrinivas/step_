import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static boolean isPalindrome(String str){

        int left=0;
        int right=str.length()-1;

        while(left<right){

            if(str.charAt(left)!=str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text: ");
        String text=sc.nextLine();

        System.out.println(isPalindrome(text));

        sc.close();
    }
}
