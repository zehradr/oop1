package oop1;
// indidual customer da bir customerdır

public class IndividualCustomer extends Customer {

	// sadece buna özel olanları tanımlıyoruz
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// setters getters yapacağız

}
