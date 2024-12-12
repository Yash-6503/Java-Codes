//Interface class of MobileSIMTest -> MobilePhoneInterface.java

package pkg.blc1;

public interface MobilePhoneInterface 
{
	void insertSim(SIMCardInterface sim);
	void removeSim(SIMCardInterface sim);
	void makeCalls(SIMCardInterface sim);
	void sendMessages(SIMCardInterface sim);
}
