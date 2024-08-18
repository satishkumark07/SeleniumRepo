package Week1.Day3.HomeAssignment;

public class FindMultipleMissingNumbers {
	public static void findMissingNumbers(int[] arr, int max) {  
        for (int i = 1; i <= max; i++) {  
            boolean found = false;  
            for (int num : arr) {  
                if (num == i) {  
                    found = true;  
                    break;  
                }  
            }  
            if (!found) {  
                System.out.print(i + " ");  
            }  
        }  
        System.out.println(); // Add a newline to separate the output.  
    }  
    public static void main(String[] args) {  
        int[] arr = {1, 2, 4, 6, 7};  
        int max = 7;  
        System.out.println("Missing numbers in the array:");  
        findMissingNumbers(arr, max);  
    }  
}
