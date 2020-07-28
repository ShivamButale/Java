class CharacterAZ extends Thread {
    public void run() {
        char x;
        for(x='A'; x<='Z'; x++) {
            System.out.print(x+" ");
        }
    }
}

public class AlphabetMultithreading {
    public static void main(String[] args) {
        CharacterAZ ch1 = new CharacterAZ();
        ch1.start();
    }
}
