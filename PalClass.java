
public class PalClass {

	 // Receives a string and returns whether or not it is a palindrome
	public static boolean pal(String s){
		if(s.length() <= 1) return true; //base case
		else if(s.charAt(0) == s.charAt(s.length() - 1)) //check pair
				return pal(s.substring(1, s.length() - 1)); //recursion call
		else
			return false;
	}
	
	public static void main(String[] args) {
		String s = "KAYK";
		System.out.println(s + (pal(s) ? " is" : " is not") + " a palindrome.");
	}

}
