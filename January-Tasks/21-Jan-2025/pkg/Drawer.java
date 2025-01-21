//BLC class of ATMMachine -> Drawer.java

package pkg;

public class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		int withdrawArr[] = {1000,2000};
		
		for(int amount : withdrawArr) {
			account.withdraw(amount);
			try {
				sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
