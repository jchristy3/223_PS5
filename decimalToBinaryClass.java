import java.util.Scanner;


public class decimalToBinaryClass {

	public static String decimalToBinary(int n){
		if(n == 0) return "";
		int i = n % 2;
		return decimalToBinary((n-i)/2).concat(Integer.toString(i));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		System.out.println(decimalToBinary(n));

	}

}
