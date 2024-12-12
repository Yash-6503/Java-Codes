//BLC class of MobileSIMTest -> BSNL.java

package pkg.blc1;

public class BSNL implements SIMCardInterface
{

	@Override
	public void phoneNumber() {
		System.out.println("Mobile Number: 8827871810");
	}

	@Override
	public void networkProvider() {
		System.out.print("Network Provider: ");
	}

	@Override
	public void ActivationORDeactivation() {
		System.out.println("Activation Status: Deactive");
	}

}

