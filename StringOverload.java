import java.io.*;

class Overload {
	String add(String a, String b) {
		return (a+b);
	}
}

class StringOverload {
	public static void main(String args[]) throws IOException{
		String x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter two values : ");
		x = br.readLine();
		y = br.readLine();
		
		Overload ol = new Overload();
		System.out.println("Result of two values : "+ol.add(x, y));
	}
}
