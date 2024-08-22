package week2Day4HomePolymorphism;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("called from send request methone which has 1 arg: "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("called from send request methone which has 3 args: "+endpoint+"\n"+requestBody+"\n"+requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient ap=new APIClient();
		ap.sendRequest("point one");
		ap.sendRequest("end point", "request body", false);
		
	}
}
