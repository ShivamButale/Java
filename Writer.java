import java.io.PrintWriter;

public class Writer {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		String st = "project 2";
		pw.println("This is "+st);
	}
}
