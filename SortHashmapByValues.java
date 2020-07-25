import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortHashmapByValues {
    public static void main(String[] args) {
        HashMap <Integer, String> hm = new HashMap<Integer, String>();
        hm.put(7, "Sunday");
        hm.put(4, "Thursday");
        hm.put(2, "Tuesday");
        hm.put(5, "Friday");
        hm.put(1, "Monday");
        hm.put(6, "Saturday");
        hm.put(3, "Wednesday");

        System.out.println("Map before sorting : ");
        Set st = hm.entrySet();
        Iterator it = st.iterator();

        while(it.hasNext()) {
            Map.Entry mpen = (Map.Entry)it.next();
            System.out.println(mpen.getKey()+" : "+mpen.getValue());
        }

        System.out.println();

        Map<Integer, String> mp = sortByValues(hm);
        System.out.println("Map after sorting : ");
        Set st1 = mp.entrySet();
        Iterator it1 = st1.iterator();
        while(it1.hasNext()) {
            Map.Entry mpen1 = (Map.Entry)it1.next();
            System.out.println(mpen1.getKey()+" : "+mpen1.getValue());
        }
    }

    public static HashMap sortByValues(HashMap mp) {
        List lt = new LinkedList(mp.entrySet());
        Collections.sort(lt, new Comparator(){
           public int compare(Object o1, Object o2) {
               return((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
           } 
        });
        HashMap sorted = new LinkedHashMap<Integer, String>();
        for(Iterator it2 = lt.iterator(); it2.hasNext();) {
            Map.Entry ent = (Map.Entry)it2.next();
            sorted.put(ent.getKey(), ent.getValue());
        }
        return sorted;
    }
}