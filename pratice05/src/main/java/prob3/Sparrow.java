package prob3;

public abstract class Sparrow extends Bird{
	private String fly;
	private String sing;
	
	public void fly() {
		System.out.println("참새(짹짹)가 날아다닙니다.");	
	}
	public void sing() {
		System.out.println("참새(짹짹)가 소리내어 웁니다.");
	}

}
