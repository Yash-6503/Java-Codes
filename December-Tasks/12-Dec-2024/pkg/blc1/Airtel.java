//BLC class of MobileSIMTest -> Airtel.java

package pkg.blc1;

public class Airtel implements SIMCardInterface
{

	@Override
	public void phoneNumber() {
		System.out.println("Mobile Number: 9925387662");
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

