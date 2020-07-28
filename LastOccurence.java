import java.util.*;
public class LastOccurence {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("000");
        list1.add("111");
        list1.add("222");
        list1.add("000");
        list1.add("111");

        System.out.println("Size of list : "+list1.size());

        System.out.println("last occurence of 111 is "+list1.lastIndexOf("000"));
        System.out.println("last occurence of 111 is "+list1.lastIndexOf("111"));
        System.out.println("last occurence of 111 is "+list1.lastIndexOf("222"));
    }
}