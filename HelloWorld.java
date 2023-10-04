// Java implementation to Encrypt a
// String into the rovarspraket (Robber Language)
import java.util.*;
import java.util.Scanner;




class GFG {


    Scanner keyboard = new Scanner(System.in);

    String answer = keyboard.nextLine();
    
	// Function return translated String
	static String translate(String a)
	{
		// Length of the String
		int len = a.length();
		String res = "";

		// Run till length of String
		for (int i = 0; i < len; i++) {
			// checking if character is vowel,
			// if yes then append it as it is
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e'
				|| a.charAt(i) == 'i' || a.charAt(i) == 'o'
				|| a.charAt(i) == 'u') {
				res = res + a.charAt(i);
			}

			// if space then append as it is
			else if (a.charAt(i) == ' ') {
				res = res + a.charAt(i);
			}

			// else double the consonant and
			// put o in between
			else {
				res = res + a.charAt(i) + 'o' + a.charAt(i);
			}
		}

		// return translated String
		return res;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "";

		// Calling function
		System.out.println(translate(str));
	}
}

// This code is contributed by PrinciRaj1992
