package Week1.Day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data =  {2,5,7,7,5,9,2,3};
		
		for (int i = 0; i < data.length; i++) {
			 for (int j = i+1; j < data.length; j++) {
			    	if (data[i]==data[j]) {
						System.out.println("method 1 duplicate value is: "+data[j]);
					}
		}
			
					
				}
		
		 //2nd method
		 Arrays.sort(data);
		 for (int k = 0; k < data.length-1; k++) {
			if (data[k]==data[k+1]) {
				System.out.println("method 2 duplicate values "+data[k+1]);
			}
		 }
	}

	}

