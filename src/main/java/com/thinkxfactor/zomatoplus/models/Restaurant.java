/*package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

public class Restaurant implements Serializable{
	
	private String resID;
	private String resName;
	private String resPhno;
	public String getResID() {
		return resID;
	}
	public void setResID(String resID) {
		this.resID = resID;
	}
	public String getResName() {
		return resName;
	}
	public Restaurant() {
		super();
	}
	public Restaurant(String resID, String resName, String resPhno) {
		super();
		this.resID = resID;
		this.resName = resName;
		this.resPhno = resPhno;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResPhno() {
		return resPhno;
	}
	public void setResPhno(String resPhno) {
		this.resPhno = resPhno;
	}

}*/


package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "tbl_restaurant")
public class Restaurant implements Serializable{
@Id
@GeneratedValue
@Column(name = "restaurant_id")
private Long id;
 
@Column(name="city")
private String city;


@Column(name="name")
private String name;


@Column(name="address")
private String address;


@Column(name="contact")
private String contact;


@Column(name="description")
private String description;


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public Integer getLikeCount() {
	return likeCount;
}
public void setLikeCount(Integer likeCount) {
	this.likeCount = likeCount;
}
public void setId(Long id) {
	this.id = id;
}
@Column(name="website")
private String website;


@Column(name="like_count")
private Integer likeCount;
public Long getId() {
	return id;
	
}
}







