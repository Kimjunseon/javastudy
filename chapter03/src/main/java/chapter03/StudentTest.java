package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		// person이 없고 먼저 불리는 이유: 자식생성자에서 부모생성자를
		// 지정하지 않으면 자동으로 부모를 부름,, 게다가 super로 먼저부르게 돼서 먼저 실행됨
		s1.setGrade(1);
		
		Person p1 = s1; //up casting(암시적, implicity)
		p1.setName("둘리");
		
		Student s2 = (Student)p1; // down casting(명시적, explicity)
		s2.setMajor("Computer Science");
		
	}

}
