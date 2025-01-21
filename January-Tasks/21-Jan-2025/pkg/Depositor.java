//BLC class of ATMMachine -> Depositor.java

package pkg;

public class Depositor extends Thread
{
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		int depositArr[] = {2000,1000};
		
		for(int amount : depositArr) {
			account.deposit(amount);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
