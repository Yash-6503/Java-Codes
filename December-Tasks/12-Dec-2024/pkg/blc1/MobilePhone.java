//BLC class of MobileSIMTest -> MobilePhone.java

package pkg.blc1;

public class MobilePhone implements MobilePhoneInterface
{

	@Override
	public void insertSim(SIMCardInterface sim) {
		System.out.println("\nSim card inserted in your Mobile");
		sim.networkProvider();System.out.println(sim.getClass().getSimpleName());
		sim.phoneNumber();
		sim.ActivationORDeactivation();
	}

	@Override
	public void removeSim(SIMCardInterface sim) {
		System.out.println("\n"+sim.getClass().getSimpleName()+" Sim card removed from your mobile");
		
	}

	@Override
	public void makeCalls(SIMCardInterface sim) {
		System.out.println("\nMaking Call from "+sim.getClass().getSimpleName()+" Sim");
		
		
	}

	@Override
	public void sendMessages(SIMCardInterface sim) {
		System.out.println("\nSending Message from "+sim.getClass().getSimpleName()+" Sim");

	}

}
