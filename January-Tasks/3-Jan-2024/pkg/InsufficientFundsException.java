// Userdefined Exception of ATM Operations -> InsufficientFundsException.java

package pkg;

public class InsufficientFundsException extends Exception 
{
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
}


