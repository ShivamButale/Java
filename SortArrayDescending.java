import java.util.*;
public class SortArrayDescending {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("JAVA");
        al.add("EYE");
        al.add("HELLO");
        al.add("WELCOME");
        al.add("AT");

        System.out.println("Array before sorting : ");
        for(String Str1:al) {
            System.out.println(Str1);
        }

        Collections.sort(al, Collections.reverseOrder());

        System.out.println();

        System.out.println("Result after Sorting in Descending Order: ");
        for(String Str1:al) {
            System.out.println(Str1);
        }
    }
}