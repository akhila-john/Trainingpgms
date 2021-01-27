package daomodel;

public class Teacher {

	private int teacherid;
	private String name;
	private String designation;
	private String gender;
	private String address;
	
	
	
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return this.getTeacherid()+" "+this.getName()+" "+this.getDesignation()+" "+this.getGender()+" "+
	this.getAddress();
	}
	
	
}
