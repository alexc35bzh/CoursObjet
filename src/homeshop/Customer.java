package homeshop;

public class Customer {
	String fullName;
	String address;

	/**
	 * CONSTRUCTEUR
	 * @param fullName
	 * @param address
	 */
	public Customer(String fullName, String address) {
		this.fullName = fullName;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}
}
