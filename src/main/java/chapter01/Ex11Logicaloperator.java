package chapter01;

public class Ex11Logicaloperator {

	public static void main(String[] args) {
		// !  (not)
		// !  (2 > 3) => True
		// !  false => True
		System.out.println(!(3 != 2));
		
		// && (and, 논리곱)
		// true and true => false
		// true and false => false
		// false and false => false
		// true and true => true
		System.out.println((3 > 2) && (3 > 4));
				
		// || (or, 논리합)
		// false and false => false
		// true and false => true
		// false and true => true
		// true and true => true		
		System.out.println((3 != 2) || (-1 > 0));
		
		// ^  (xor, 베타적 논리합)
		// false and false => false
		// true and false => true 
		// false and true => true
		// true and true => false
		System.out.println((3 != 2) ^ (-1 > 0));
	}

}
