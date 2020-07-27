import java.util.StringTokenizer;

public class RemoveMultipleSpaces {
    public static void main(String[] args) {
        String Str1 = "Hello   World   and today is java";
        StringTokenizer Str2 = new StringTokenizer(Str1, " ");
        StringBuffer Str3 = new StringBuffer();

        while(Str2.hasMoreElements()) {
            Str3.append(Str2.nextElement()).append(" ");
        }

        System.out.println(Str3.toString().trim());
    }
}