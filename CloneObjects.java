public class CloneObjects implements Cloneable{
    String name;
    int record;

    public CloneObjects(String name, int record) {
        this.name = name;
        this.record = record;
    }

    public void show() {
        System.out.println("Welcome "+name+". Your score is : "+record);
    }

    public static void main(String[] args) {
        CloneObjects co  = new CloneObjects("David", 98);
        try {
            CloneObjects co1 = (CloneObjects)co.clone();
            co1.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}