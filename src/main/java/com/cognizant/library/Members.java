package com.cognizant.library;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class Members {
	private static int numOfMembers = 0;
	private String firstName;
	private String lastName;
	private String postCode;
	private String address;
	private String townCity;
	private String county;
	private String country;
	private String dayOfBirth;
	private String monthOfBirth;
	private String yearOfBirth;
	private String membershipType;
	private String dateOfBirth = dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth;
	private String mID = "M"+StringUtils.leftPad(""+numOfMembers,4,"0");
	private static HashMap<String,Members> members = new HashMap<String,Members>();
	Members(String firstName,String lastName,String postCode,String address
			,String townCity,String county,String country,String dayOfBirth,
			String monthOfBirth,String yearOfBirth,String membershipType){
		this.firstName=firstName ;     
	    this.lastName=lastName;      
        this.postCode=postCode;      
        this.address=address;       
        this.townCity=townCity;      
        this.county=county;        
        this.country=country;       
        this.dayOfBirth=dayOfBirth;    
        this.monthOfBirth=monthOfBirth;  
        this.yearOfBirth=yearOfBirth;   
        this.membershipType=membershipType;
        getMembers().put(mID, this);
	}
	public String getMID() {
		return this.mID;
	}
	//Getters
	public static HashMap<String,Members> getMembers(){
		return members;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPostCode() {
		return this.postCode;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCounty() {
		return this.county;
	}
	public String getCountry() {
		return this.country;
	}
	public String getTownCity() {
		return this.townCity;
	}
	public String getDayOfBirth() {
		return this.dayOfBirth;
	}
	public String getMonthOfBirth() {
		return this.monthOfBirth;
	}
	public String getYearOfBirth() {
		return this.yearOfBirth;
	}
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	public String getMembershipType() {
		return this.membershipType;
	}
	//Setters
	public static void setMembers(HashMap<String,Members> member){
		members = member;
	}
	public void setFirstName(String firstName) {
		this.firstName =firstName;
	}      
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}      
	public void setPostCode(String postCode) {
		this.postCode=postCode;
	}      
	public void setAddress(String address) {
		this.address=address;
	}      
	public void setTownCity(String townCity) {
		this.townCity=townCity;
	}
	public void setCounty(String county) {
		this.county =county;
	}     
	public void setCountry(String country) {
		this.country=country;
	}      
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth=dayOfBirth;
	}      
	public void setMonthOfBirth(String monthOfBirth) {
		this.monthOfBirth=monthOfBirth;
	}     
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth=yearOfBirth;
	}      
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}     
	public void setMembershipType(String membershipType) {
		this.membershipType=membershipType;
	}
	
}