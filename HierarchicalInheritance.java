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

class LevelC extends LevelA {
    public void showC() {
        System.out.println("C's Level");
    }
}

class LevelD extends LevelA {
    public void showD() {
        System.out.println("D's Level");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        LevelB lb= new LevelB();
        lb.showB();
        lb.showA();

        LevelC lc = new LevelC();
        lc.showC();
        lc.showA();
        
        LevelD ld = new LevelD();
        ld.showD();
        ld.showA();
    }
}