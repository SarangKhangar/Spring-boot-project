package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contactinfo10")

public class ContactInfo {
	
	@Id
	@Column
	private int contactId;

	@Column
	private String emailId;

	@Column
	private String phoneNo;
    
	@OneToOne
	@MapsId
	@JoinColumn(name="person_id")
	private Person person;

	public ContactInfo(String emailId, String phoneNo) {
		super();
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public ContactInfo() {
		super();
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Person getPerson() {
		return person;
	}

	public  void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "ContactInfo [contactId=" + contactId + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

}
