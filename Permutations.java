import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String Str1 = sc.nextLine();

        System.out.println("Result of Permutations is : "+StrPermut(Str1));
    }

    public static Set<String> StrPermut(String Str1) {
        Set<String> strper = new HashSet<String>();
        if(Str1==null) {
            return null;
        }
        else if(Str1.length() == 0) {
            strper.add("");
            return strper;
        }

        char first = Str1.charAt(0);
        String Str2 = Str1.substring(1);

        Set<String> Str4 = StrPermut(Str2);
        for(String StrOne:Str4) {
            for(int x =0; x<=StrOne.length(); x++) {
                strper.add(charInsert(StrOne,first, x));
            }
        }
        return strper;
    }

    public static String charInsert(String Str1, char ch, int y) {
        String second = Str1.substring(0, y);
        String last = Str1.substring(y);

        return second + ch + last;
    }

}