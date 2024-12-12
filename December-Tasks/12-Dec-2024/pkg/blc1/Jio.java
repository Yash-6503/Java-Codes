//BLC class of MobileSIMTest -> Jio.java

package pkg.blc1;

public class Jio implements SIMCardInterface
{

	@Override
	public void phoneNumber() {
		System.out.println("Mobile Number: 9038686191");
	}

	@Override
	public void networkProvider() {
		System.out.print("Network Provider: ");
	}

	@Override
	public void ActivationORDeactivation() {
		System.out.println("Activation Status: Active");
	}


}

