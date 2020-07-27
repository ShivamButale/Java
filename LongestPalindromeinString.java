import java.util.*;

public class LongestPalindromeinString {
    public String LongPalin(String Str1) {
        if(Str1.isEmpty()) {
            return null;
        }
        if(Str1.length() ==1) {
            return Str1;
        }

        String lngs = Str1.substring(0, 1);
        for(int x=0; x<Str1.length(); x++) {
            String lngx = LongestPalindrome(Str1, x, x);
            if(lngx.length() > lngs.length()) {
                lngs = lngx;
            }
            lngx = LongestPalindrome(Str1, x, x+1);
            if(lngx.length() > lngs.length()) {
                lngs = lngx;
            }
        }
        return lngs;
    }

    public String LongestPalindrome(String Str1, int start, int last) {
        while(start >= 0 &&  last<=Str1.length()-1 && Str1.charAt(start)==Str1.charAt(last)) {
            start--;
            last++;
        }
        return Str1.substring(start+1, last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String Str2 = sc.nextLine();
        
        System.out.println("Result of Longest Palindrome : "+new LongestPalindromeinString().LongPalin(Str2));
    }
}