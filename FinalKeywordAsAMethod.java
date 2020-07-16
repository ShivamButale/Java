class Keyword {
    final void display() {
        System.out.println("This is a final method");
    }
}

public class FinalKeywordAsAMethod extends Keyword{
    public static void main(String args[]) {
        FinalKeywordAsAMethod f1 = new FinalKeywordAsAMethod();
        f1.display();
    }
}