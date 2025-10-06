package basic_recursion;
import java.util.*;

public class s_palindrome {
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s=" A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
