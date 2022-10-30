package prob2;

public class Phone {
	public void execute( String function ) {
		if(function == "앱") {
			app();
		} else {
		call();
		}
	}
	
	private void call(){
		System.out.println("통화기능시작");
	}
	
	private void app(){
		System.out.println("앱실행");
	}
}
