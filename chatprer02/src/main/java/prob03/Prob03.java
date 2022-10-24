package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char[] charArrary = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(charArrary);

		// 공백 만들기
		replaceSpace(charArrary);
		
		// 수정된 배열 원소 출력
		printCharArray(charArrary);
	}
	
	public static void printCharArray(char[] cs) {
		for(int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);
		} System.out.println("");
	}

	 public static void replaceSpace(char[] cs) {
		 for(int i = 0; i < cs.length; i++) {
			if(cs[i] == ' '){
				cs[i] = ',';
			}
			}
		}

	}

