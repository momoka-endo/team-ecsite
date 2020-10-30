package jp.co.internous.cepheus.model.domain;

import java.sql.Timestamp;

import jp.co.internous.cepheus.model.form.DestinationForm;

public class MstDestination {
	
	private int id;
	
	private int userId;
	
	private String familyName;
	
	private String firstName;
	
	private String telNumber;
	
	private String address;
	
	private int status;
	
	private Timestamp ceratedAt;
	
	private Timestamp updatedAt;
	
	
	public MstDestination () {}
	
	public MstDestination(DestinationForm f) {
		userId = f.getUserId();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		telNumber = f.getTelNumber();
		address = f.getAddress();
	}
	

	public long getId() {
		
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getCeratedAt() {
		return ceratedAt;
	}

	public void setCeratedAt(Timestamp ceratedAt) {
		this.ceratedAt = ceratedAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

}