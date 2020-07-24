import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date dtime = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("E");
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMM");

        System.out.println("Current Date is "+sdf1.format(dtime));
        System.out.println("Current Day is "+sdf2.format(dtime));
        System.out.println("Current Time is "+sdf3.format(dtime));
        System.out.println("Current Month is "+sdf4.format(dtime));
    }
}