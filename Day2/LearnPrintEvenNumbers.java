package Week1.Day2;

public class LearnPrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value=25;
		
		for (int i = 0; i <= value; i++) {
			if (i%2==0) //you can also use following condition "if (i%2!=1)"
			{
				System.out.println("even number:"+i);
			}
		}
	}

}
