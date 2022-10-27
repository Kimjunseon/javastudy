package prob05;
// 오버라이드 문제
public class Prob05 {

	public static void main(String[] args) {
		Base base = new MyBase();

		base.service("낮");
		base.service("밤");
		base.service("오후"); 
	}
}
