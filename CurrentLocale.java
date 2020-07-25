import java.util.*;
public class CurrentLocale {
    public static void main(String[] args) {
        Locale lc = Locale.getDefault();
        System.out.println(lc.getDisplayCountry());
        System.out.println(lc.getDisplayLanguage());   
        
        System.out.println(lc.getCountry());
        System.out.println(lc.getLanguage());

        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }
}