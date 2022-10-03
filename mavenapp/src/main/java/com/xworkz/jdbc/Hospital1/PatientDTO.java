package com.xworkz.jdbc.Hospital1;

public class PatientDTO {
	
	private int id;
	private String name;
	private String gender;
	private int roomno;
	private String contactNo;
	private String address;
	private String doctorname;
	private int age;
	private String hospitalname;
	private String hospitaladdress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getHospitaladdress() {
		return hospitaladdress;
	}
	public void setHospitaladdres(String hospitaladdress) {
		this.hospitaladdress = hospitaladdress;
	}
	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", roomno=" + roomno + ", contactNo="
				+ contactNo + ", adress=" + address + ", doctorname=" + doctorname + ", age=" + age + ", hospitalname="
				+ hospitalname + ", hospitaladdres=" + hospitaladdress + "]";
	}
	public PatientDTO() {
		
	}
	
	

}
