import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("world");
        al.add("Hello");
        al.add("java");
        al.add("python");

        System.out.println("Initial List : ");
        System.out.println(al);

        LinkedHashSet<String> hset = new LinkedHashSet<String>();
        hset.addAll(al);

        al.clear();

        al.addAll(hset);

        System.out.print("List after removing duplicate elements : ");
        System.out.println(al);
    }
}