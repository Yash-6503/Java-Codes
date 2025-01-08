// Userdefined RuntimeException of ATM Operations -> LoanNotAllowedException.java

package pkg;

public class LoanNotAllowedException extends RuntimeException
{
	public LoanNotAllowedException(String errorMessage) {
		super(errorMessage);
	}
}
