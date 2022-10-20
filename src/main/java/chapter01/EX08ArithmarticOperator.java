package chapter01;

public class EX08ArithmarticOperator {

	public static void main(String[] args) {
		final int TIME = 20000; // 20000초
		
		int hour = 0;
		int minutes = 0;
		int seconds = 0;
		int divhour = 0;
		
//		int hour = TIME / 60 / 60;
//		int minutes = TIME / 60 % 60;
//		int seconds = TIME % 60;
		
		
		hour = TIME / 3600; // 시
		divhour = TIME % 3600; // 나머지
		minutes = divhour / 60; // 분
		seconds = divhour % 60; // 초
		
		System.out.println(TIME + "초는 "+ hour + "시간 "+ minutes +"분 "+ seconds +"초");
	}
}
