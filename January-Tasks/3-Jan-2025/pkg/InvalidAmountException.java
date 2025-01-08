// Userdefined RuntimeException of ATM Operations -> InvalidAmountException.java

package pkg;

public class InvalidAmountException extends RuntimeException 
{
	public InvalidAmountException(String errorMessage) {
		super(errorMessage);
	}
}
