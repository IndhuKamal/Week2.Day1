package week2.Day1;

public class ReverseString {
public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/
		int length = test.length();
        System.out.println("The length of the string is=" +length);
		char[] array = test.toCharArray();
		for(int i=length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		/* Pseudo Code: 2
		a) Find the length of the string
		
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		
		c) Find the character of the String using its index
		*/
	for(int j=length-1;j>=0;j--) {
		
		char charAt = test.charAt(6);
		System.out.println("Character at 6th Index is: " +charAt);
		break;
	}
	
}

}


