import java.util.Scanner;


public class TRFactorialClass {

	public static int factorial(int n, int h) {
		h *= n;			//h stores 'reverse factorial' (init! - curr!)
		if (n <= 1) return h;	//return h at nth recursive call
		else return factorial(n-1, h);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		System.out.println(n + "! = " + factorial(n, 1));
	}

}
