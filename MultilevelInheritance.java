class LevelA {
    public void showA() {
        System.out.println("A's Level");
    }
}

class LevelB extends LevelA {
    public void showB() {
        System.out.println("B's Level");
    }
}

class LevelC extends LevelB {
    public void showC() {
        System.out.println("C's Level");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        LevelC lc = new LevelC();
        lc.showA();
        lc.showB();
        lc.showC();
    }
}