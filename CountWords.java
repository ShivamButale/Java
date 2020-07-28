import java.util.*;
public class CountWords {
    static int z, y=0, output;
    static int count(String s) {
        char ch[] = new char[s.length()];
        for(z = 0; z<s.length(); z++) {
            ch[z] = s.charAt(z);
            if( ((z>0) && (ch[z] != ' ') && (ch[z-1] == ' ')) || ((ch[0] != ' ') && (z ==0 ))) {
                y++;
            }
        }
        return y;
    }
    public static void main(String[] args) {
        String str1 = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  : ");
        str1 = sc.nextLine();
        int words = CountWords.count(str1);
        System.out.println("No of words : "+words);
    }
}