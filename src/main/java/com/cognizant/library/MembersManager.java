package com.cognizant.library;

public class MembersManager {
	//Add Member
	
	public String addMember(String firstName,String lastName,String postCode,String address
									,String townCity,String county,String country,String dayOfBirth
									,String monthOfBirth,String yearOfBirth,String membershipType) {
		
		Members member =new Members( firstName, lastName, postCode, address
									,townCity, county, country, dayOfBirth
									,monthOfBirth, yearOfBirth, membershipType);
		return member.getFirstName();
	}
	
	//Delete Member
	
	public boolean deleteMember(String mID) {
		Members.getMembers().remove(mID);
		return Members.getMembers().containsKey(mID);
	}
	
	//Update Member
	
	public String updateMemberFirstName(String mID,String firstName) {
		Members.getMembers().get(mID).setFirstName(firstName);
		return Members.getMembers().get(mID).getFirstName();
		
	}
	public String updateMemberLastName(String mID,String lastName) {
		Members.getMembers().get(mID).setLastName(lastName);	
		return Members.getMembers().get(mID).getLastName();
	}
	
	public String updateMemberPostCode(String mID,String postCode) {
		Members.getMembers().get(mID).setPostCode(postCode);	
		return Members.getMembers().get(mID).getPostCode();
	}
	
	public String updateMemberAddress(String mID,String address) {
		Members.getMembers().get(mID).setAddress(address);
		return Members.getMembers().get(mID).getAddress();
	}
	
	public String updateMemberTownCity(String mID,String townCity) {
		Members.getMembers().get(mID).setTownCity(townCity);
		return Members.getMembers().get(mID).getTownCity();
	}
	
	public String updateMemberCounty(String mID,String county) {
		Members.getMembers().get(mID).setCounty(county);
		return Members.getMembers().get(mID).getCounty();
	}
	
	public String updateMemberCountry(String mID,String country) {
		Members.getMembers().get(mID).setCountry(country);
		return Members.getMembers().get(mID).getCountry();
	}
	
	public String updateMemberDayOfBirth(String mID,String dayOfBirth) {
		Members.getMembers().get(mID).setDayOfBirth(dayOfBirth);
		return Members.getMembers().get(mID).getDayOfBirth();
	}
	
	public String updateMemberMonthOfBirth(String mID,String monthOfBirth) {
		Members.getMembers().get(mID).setMonthOfBirth(monthOfBirth);;
		return Members.getMembers().get(mID).getMonthOfBirth();
	}
	
	public String updateMemberYearOfBirth(String mID,String yearOfBirth) {
		Members.getMembers().get(mID).setYearOfBirth(yearOfBirth);;
		return Members.getMembers().get(mID).getYearOfBirth();
	}
	
	public String updateMemberMembershipType(String mID,String membershipType) {
		Members.getMembers().get(mID).setMembershipType(membershipType);;
		return Members.getMembers().get(mID).getMembershipType();
	}
}
