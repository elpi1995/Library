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
	private String mID = "M"+ firstName.substring(0, 1)+ lastName.substring(0, 1)+StringUtils.leftPad(""+numOfMembers,4,"0")+yearOfBirth.substring(yearOfBirth.length()-3, yearOfBirth.length()-1);
	private static HashMap<String,Members> members = new HashMap<String,Members>();
	Members(String firstName,String lastName,String postCode,String address,String townCity,String county,String country,String dayOfBirth,String monthOfBirth,String yearOfBirth,String membershipType){
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
	//Getters
	public static HashMap<String,Members> getMembers(){
		return members;
	}
	public String getMID() {
		return this.mID;
	}
	}