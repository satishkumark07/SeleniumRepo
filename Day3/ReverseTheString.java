package Week1.Day3;

import java.util.Iterator;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String value="Satish";
		  char[] charArray = value.toCharArray();
		  for (int i = charArray.length-1; i >=0; i--) {
			  //Printing Given string in reverse 
			System.out.println(charArray[i]);
		}
		  
	}

}
