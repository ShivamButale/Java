import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("USA");
        list.add("Canada");
        list.add("UK");

        System.out.println("The elements of the ArrayList are "+list);
        
        list.add(0, "Mexico");
        list.add(3, "New Zealand");

        System.out.println("The elements of the ArrayList are "+list);

        list.remove(1);
        list.remove(3);

        System.out.println("The elements of the ArrayList are "+list);


    }
}