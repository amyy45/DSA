package basic_recursion;
import java.util.*;

public class string_palindrome {
    static boolean isPalindrome(int i, String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(i>s.length()/2) {
            return true;
        }
        if(s.length()==0) {
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        } 
        return isPalindrome(i+1,s);
    }

    public static void main(String[] args) {
        String s=" A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(0,s));
    }
}
