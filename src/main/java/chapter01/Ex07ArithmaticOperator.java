package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
		// uary operator
		System.out.println(-a);
		
		//  (++a, a += 1) a는 a+1
		++a;
		System.out.println(a);
		
		//  a++
		a++;
		System.out.println(a);
		
		// System.out.println(a++);
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		
		// 계산순서 K는 먼저 15 (10 + 5) 그 이후에 ++ 이 작동해서 16이 됨
		int k = 10 + a++;
		System.out.println(k);
		
		System.out.println(++a); // 8
		System.out.println(a); 	 // 8
		
		System.out.println(--a); // 7
		System.out.println(a); 	 // 7
		System.out.println(a++); // 7
		System.out.println(a);   // 8
		
	}

}
