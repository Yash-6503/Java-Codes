// OrderClass of Example1.java

import java.util.Date;

public class OrderClass 
{
	int orderId;
	String custName;
	Date date;
	double totalAmount;
	
	public OrderClass(int orderId, String custName, Date date, double totalAmount) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.date = date;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "OrderClass [orderId=" + orderId + ", custName=" + custName + ", date=" + date + ", totalAmount="
				+ totalAmount + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
