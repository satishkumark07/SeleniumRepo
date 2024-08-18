package Week1.Day3;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data =  {35,32,77,86,21,35,89,1,77,32};
		//outer loop
		for (int i = 0; i < data.length; i++) {
			//inner loop
		    for (int j = i+1; j < data.length; j++) {
		    	if (data[i]==data[j]) {
					System.out.println("duplicate value is: "+data[j]);
				}
				
			}
		}
		
		//method 2 : single for loop
		// int[] data =  {35,32,77,86,21,35,89,1,77,32};
		// sort the values in ascending order
		// compare neighbering values
		
		
		
	}

}
