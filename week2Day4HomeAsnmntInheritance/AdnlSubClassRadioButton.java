package week2Day4HomeAsnmntInheritance;

public class AdnlSubClassRadioButton extends SubClassButton {
	
public void selectRadioButton() {
		
		System.out.println("message from selectRadioButton( method of AdnlSubClassRadioButton");
	}
public static void main(String[] args) {
	
	AdnlSubClassCheckBoxButton rb=new AdnlSubClassCheckBoxButton();

	rb.submit();
	rb.click();
	rb.setText();
	
}
}
