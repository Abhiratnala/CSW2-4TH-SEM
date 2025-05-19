package com.spring.mavenDependency;

public class address {
	private int houseno,pincode;
	private String city;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

   public String toString() {
	   return ("address: "+this.getCity()+" "+this.getHouseno()+" "+this.pincode);
	
}


}
