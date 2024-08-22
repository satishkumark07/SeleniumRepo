package week2Day4HomeAsnmntInheritance;

public class SubClassTextField extends BaseWebElement {
	public void getText() {
		System.out.println("message from gettext method of sub class text field");
		
	}
	
	public static void main(String[] args) {
		
		SubClassTextField sct=new SubClassTextField();
			sct.getText();
			sct.click();
			sct.setText();
	}
}
