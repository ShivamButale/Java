import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("H");
        al.add("E");
        al.add("L");
        al.add("L");
        al.add("O");

        System.out.println("Before reversal : "+al);
        Collections.reverse(al);
        System.out.println("After reversal : "+al);

    }
}