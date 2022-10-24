package chapter01;

public class ExMainParam {
	
	// 메이븐은 타겟에서 생성

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	
		
	}

}
