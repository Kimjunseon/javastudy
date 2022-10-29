package prob05;

public class Account {
	private String accountNo; // 계좌번호
	private int balance; // 잔고
	private int save; // 입금
	private int deposit; // 출금
	
	
	public Account(){
		
	}
	
	public Account(String account){
		
	}
	

	void save(int i) {
		this.save = save + i;
		
	}
	 
	public void deposit(int i) {
		this.deposit = deposit + i;
			
	}

	
	
	
	
	// setter getter space
	public String getAccountNo() {
		accountNo = "078-3762-293";
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		balance = save - deposit;
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getSave() {
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
}
