package net.me.dev.places;

public class Location {
	public String country = "";
	public String state = "";
	public String city = "";
	public String facility = "";
	
	public Location(String country, String state, String city, String facility) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.facility = facility;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public String getFacility() {
		return facility;
	}
	
	public String getFullLocation() {
		return this.getFacility()+","+this.country+","+this.state+","+this.country;
	}
}