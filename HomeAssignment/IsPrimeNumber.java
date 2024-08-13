package Week1.Day.HomeAssignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int count = 0;
		
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Given Nume Is Prime "+n);
		}
		else {
		
		System.out.println("Given Number Is not Prime "+n);
		
	}
}

}	