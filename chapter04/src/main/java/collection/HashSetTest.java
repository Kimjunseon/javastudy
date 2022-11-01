package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s1);
		
		System.out.println(s.size());
		System.out.println(s.contains(s2));
		
		// 순회 1 이터구문이 되면 아래와 같이 실행코드도 된다
		for(String str: s) {
			System.out.println(str);
		}
	}

}
