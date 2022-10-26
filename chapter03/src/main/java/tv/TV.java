package tv;

public class TV {
	private int channel;	// 1~255 사이 값을 가지게 하고 라운딩 할 것
	private int volume;		// 0~100 사이 값을 가지게 하고 라운딩 할 것
	private boolean power;	
	
	public void status( ) {
		System.out.println("TV[채널값 볼륨값 파워값 트루면 온 펄스면 오프]");
	}
}
