import java.util.*;
public class SortHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("f Saturday", 6);
        mp.put("d Thursday", 4);
        mp.put("b Tuesday", 2);
        mp.put("e Friday", 5);
        mp.put("g Sunday", 7);
        mp.put("c Wednesday", 3);
        mp.put("a Monday", 1);

        System.out.println("Elements before sorting Map : ");
        Set st = mp.entrySet();
        Iterator it = st.iterator();

        while(it.hasNext()) {
            Map.Entry mpen = (Map.Entry)it.next();
            System.out.println(mpen.getKey()+ ":"+mpen.getValue());
        }

        System.out.println();

        Map<String, Integer> mpsi = new TreeMap(mp);
        System.out.println("After Sorting : ");
        Set st1 = mpsi.entrySet();
        Iterator it1  = st1.iterator();
        while(it1.hasNext()) {
            Map.Entry mpen1 = (Map.Entry)it1.next();
            System.out.println(mpen1.getKey()+ ":"+mpen1.getValue());
        }

    }
}