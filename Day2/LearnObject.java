package Week1.Day2;

public class LearnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearnMethods op=new LearnMethods();
		
		op.browserName();
		
		int numberOfBrowser = op.numberOfBrowser();
		System.out.println(numberOfBrowser);
		System.out.println(op.browserUrl("google.in", "Email"));
	}

}
