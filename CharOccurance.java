package week2.Day1;

public class CharOccurance {
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
			String str = "welcome to chennai";

			// declare and initialize a variable count to store the number of occurrences
			int count=0;
			
			// convert the string into char array
			char[] charArray = str.toCharArray();
			for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
			}
			//get the length of the array
			int length = str.length();
			System.out.println("The length of the array is " +length);
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='e') {
				count=count+1;
				
			}
								// if is has increment the count
					 
			}	
			System.out.println("Letter 'e' occured " +count + " number of times");
			
	// print the count out of the loop
					
	}
}
