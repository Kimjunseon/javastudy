package prob05;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("078-3762-293");
		
		// 계좌 개설
		System.out.println(account.getAccountNo() + " 계좌가 개설되었습니다.");
		
		// 계좌 잔고
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원입니다.");
		
		// 계좌 입금
		account.save(100);
		System.out.println(account.getAccountNo() + " 계좌에 " + account.getSave() + "만원이 입금되었습니다.");
		
		// 계좌 잔고
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원입니다.");
		
		// 계좌 잔고
		account.deposit(30);
		System.out.println(account.getAccountNo() + " 계좌에 " + account.getDeposit() + "만원이 출금되었습니다.");
		
		// 계좌 출금
		System.out.println(account.getAccountNo() + " 계좌의 잔고는 " + account.getBalance() + "만원입니다.");
		

	}

}
