package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		// s1이 동작되는 원리는 s2와 같다
		String s1 = "Hello " + "World " +  "Java " + 12;
		System.out.println(s1);
		
		String s2 = new StringBuffer("Hello ").append("World ").append("Java").append(12).toString();
		System.out.println(s2);
		
		// 단 밑에 코드가 100000번 이상 실행된다면 new 구문이 계속호출되므로 되게 느려짐
		// 좋지 않은 코드
		String s3 = "";
		for(int i = 0; i <= 9; i++) {
			s3 += i;	
		}
		System.out.println(s3);
		
		// 스트링버터를 통해 new의 반복을 사용하지않고 실행하는 법
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0; i <= 100000; i++) {
			sb2.append(i);
		}
		
		String s4 = sb2.toString();
		System.out.println(s4.length());
		
	}

}
