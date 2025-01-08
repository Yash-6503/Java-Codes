//BLC class of CarUser -> CarStoppedException.java

package pkg;

public class CarStoppedException extends Exception
{	
	public CarStoppedException(String stop) {
		super(stop);
	}
}