package chapter01;

public class Ex17Switch {
	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A':{
			System.out.println("참 잘했어요");
			break;
		}
		case 'B': {
			System.out.println("참 잘했어요");
			break;
		}
		case 'C': {
			System.out.println("좀 더 노력하세요");
			break;
		}
		case 'D': {
			System.out.println("좀 더 노력하세요");
			break;
		}
		case 'F': {
			System.out.println("다음 학기에 재수강하세요");
			break;
		}
		default: {
			System.out.println("알 수 없는 값입니다");
			break;
		}
		}

	}

}
