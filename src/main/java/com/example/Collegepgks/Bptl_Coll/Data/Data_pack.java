package com.example.Collegepgks.Bptl_Coll.Data;

import org.springframework.stereotype.Component;

@Component
public class Data_pack {

	public String getRollno() {
		return Rollno;
	}
	public void setRollno(String rollno) {
		Rollno = rollno;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	private	String Rollno;
	private String Fullname;
	private String Emailid;
	private String District;
	private Long   contact;
	
	
	
	
}
