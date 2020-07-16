import java.io.*;

class Overload {
	public static void main(String args[]) throws IOException{
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter two integers : ");
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
		Overloading ol = new Overloading();
		System.out.println("Result of your numbers are : "+ol.sum(x, y));
	}
}

class Overloading {
	int sum(int num1, int num2) {
		return (num1*num2);
	}
}

