package ProgrammingChallenges.Ch10;

public class Customer extends Person {
	private String CustomerNo;
	
	private boolean onMailingList;
	
	// a no-arg constructor
	public Customer() {}
	
	public Customer(String name, String address, String phoneNo, String custNo) {
		super(name, address, phoneNo);
		
		this.CustomerNo = custNo;
	}
	
	/**
	 * @param name
	 * @param address
	 * @param phoneNo
	 */
	public Customer(String name, String address, String phoneNo, String custNo, boolean onMailingList) {
		super(name, address, phoneNo);
		
		this.CustomerNo = custNo;
		
		this.onMailingList = onMailingList;
	}

	/**
	 * @return the customerNo
	 */
	public String getCustomerNo() {
		return CustomerNo;
	}

	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(String customerNo) {
		CustomerNo = customerNo;
	}

	/**
	 * @return the onMailingList
	 */
	public boolean isOnMailingList() {
		return onMailingList;
	}

	/**
	 * @param onMailingList the onMailingList to set
	 */
	public void setOnMailingList(boolean onMailingList) {
		this.onMailingList = onMailingList;
	}

	@Override
	public String toString() {
		return super.toString() + ", customer no: " + CustomerNo + ". Do you want to be on the mailing list: " + onMailingList;
	}
	
	
}
