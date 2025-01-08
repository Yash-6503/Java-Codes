// BLC class of ATM Operations -> BankAccount.java

package pkg;

public class BankAccount implements Bank 
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount for deposit");
		}else {
			balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Amount is Invalid");
		}else if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds to withdraw");
		}else {
			balance -= amount;
		}
	}

	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("Amount is Invalid");
		}else if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds to withdraw");
		}
		else if(toAccount == null) {
			throw new AccountNotFoundException("Account not Found");
		}
		else {
			balance -= amount;
			toAccount.balance += amount;
		}
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
		int loanLimit = 50000;
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount");
		}else if(amount > loanLimit) {
			throw new LoanNotAllowedException("Exceeds Loan Limit");
		}else {
			balance += amount;
		}
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

}
