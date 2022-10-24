package part2_Question5;

class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}

public class Account {
	private long balance;
	public long getBalance() { return balance;}
	public void setBalance(long balance){ this.balance = balance; }
	public void deposit(int money){ balance += money; }
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money){
			throw new BalanceInsufficientException("잔고부족 : " + (money-balance)+ "원 모자람");
		}
		balance -= money;
	}
	
	public static void main(String[] args) {
		Account account = new Account();
		
		account.balance = 10000;
		
		try {
			account.withdraw(15000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}
}
