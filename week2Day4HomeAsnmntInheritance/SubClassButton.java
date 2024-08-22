package week2Day4HomeAsnmntInheritance;

public class SubClassButton extends BaseWebElement {
	public void submit() {
		System.out.println("message from submit method of sub class button");
		
	}
	
public static void main(String[] args) {
		
	SubClassButton scb=new SubClassButton();
		scb.submit();
		scb.click();
		scb.setText();
}
}
