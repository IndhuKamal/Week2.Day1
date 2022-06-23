package week2.Day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String output="";
		String test = "I am a software tester";
		int count=0;
		String[] split = test.split(" ");
	
      for(int i=0;i<split.length;i++) {
       
       if((i+1)%2==0) {
    	   char[] charr=split[i].toCharArray();
    	   String rev= "";
    	  for(int j=charr.length-1;j>=0;j--) {
    		  
    		  rev=rev+charr[j];
    	  }
    	    output=output+rev+ "";	
    	    }
       else {
    	   output=output+split[i]+ " ";
      
       } 
      }
      System.out.println(output);
       
      }
    	  
      }
     


