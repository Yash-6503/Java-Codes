// Userdefined Exception of ATM Operations -> AccountNotFoundException.java

package pkg;

public class AccountNotFoundException extends Exception 
{
	public AccountNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
