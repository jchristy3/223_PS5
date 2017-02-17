import java.util.Scanner;


public class RevDisplayClass {
	
	public static void reverseDisplay(int n){
		int i = n % 10; //get far right value
		System.out.print(i); //print it
		if(n > 9) reverseDisplay(n / 10); // >2 digits size limit
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		reverseDisplay(n);
	}
}
