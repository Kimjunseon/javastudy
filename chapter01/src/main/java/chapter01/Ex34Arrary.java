package chapter01;

public class Ex34Arrary {
	
	public static void main(String[] args) {
		int sum2 = 0;
		int[] scores = new int[] {90, 100, 80, 70, 80, 90, 50, 60, 30, 80};
		for(int i = 0; i < scores.length; i++) {
			sum2 = sum2 + scores[i];
		}
		float avg2 = sum2 / scores.length;
		System.out.println("평균: " + avg2);
	}
}
