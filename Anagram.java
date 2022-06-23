package week2.Day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String input1="stop";
	String input2="post";
	int length1= input1.length();
	int length2 = input2.length();
	if(length1==length2) {
		System.out.println("Two strings are equal");
		
	}else
	{
		System.out.println("Two strings are not equal");
	}
	char[] charArray1 = input1.toCharArray();
	char[] charArray2 = input2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	if(Arrays.equals(charArray1, charArray2)) {
		System.out.println("Given String is Anagram");
	}else {
		System.out.println("Given string is not an Anagram");
	}
	
	
	
}
}
