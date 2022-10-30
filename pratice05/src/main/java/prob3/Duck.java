package prob3;

public abstract class Duck extends Bird{
	private String fly;
	private String sing;
	
	public void fly() {
		System.out.println("오리(꽥꽥이)는 날지 않습니다.");
	}
	public void sing() {
		System.out.println("오리(꽥꽥이)가 소리내어 웁니다.");
	}
}
