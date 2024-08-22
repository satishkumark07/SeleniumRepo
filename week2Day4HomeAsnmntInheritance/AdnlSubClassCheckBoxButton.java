package week2Day4HomeAsnmntInheritance;

public class AdnlSubClassCheckBoxButton extends SubClassButton {
	public void clickCheckButton() {
		
		System.out.println("message from clickCheckButton method of AdnlSubClassCheckBoxButton");
	}
	
	public static void main(String[] args) {
		
		AdnlSubClassCheckBoxButton cb=new AdnlSubClassCheckBoxButton();
		cb.clickCheckButton();
		cb.submit();
		cb.click();
		cb.setText();
	}
}
