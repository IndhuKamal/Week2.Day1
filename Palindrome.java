package week2.Day1;

public class Palindrome {

public static void main(String[] args) {
	String str="APPA";
	String rev="";
	int length = str.length();
	System.out.println(length);
	for(int i=length-1;i>=0;i--) {
		rev=rev+str.charAt(i);
        }
	System.out.println("Reversed String is " + rev);
	if(str.equals(rev)) {
		System.out.println(str+" String is Palindrome");
	}else {
		System.out.println(str+" String is not Palindrome");
	}

		
	
	}
}


		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

	


