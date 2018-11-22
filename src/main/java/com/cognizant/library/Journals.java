package com.cognizant.library;

import org.apache.commons.lang3.StringUtils;

public class Journals extends Items{
	private static int numOfJournals = 0;
	private String subType;
	private String publication;
	private String day;
	private int edition;
	private String ISSN;
	private String jID = "J"+StringUtils.leftPad(""+numOfJournals,4,"0");
	Journals(String frontPage,String month,  int year,String subType,String publication,int edition,String day,String ISSN){
		super(frontPage, month,year);
		this.subType = subType;
		this.publication = publication;
		this.edition = edition;
		this.day =day;
		this.ISSN = ISSN;
		numOfJournals++;
	}
	String type() {
		return "Journal";
	}
	String id() {
		return "I"+jID;
	}
	//Getters
		public static int getNumOfJournals() {
			return numOfJournals;
		}
		
		public String getSubType() {
			return this.subType;
		}
		public String getPublication() {
			return this.publication;
		}
		public String getDay() {
			return this.day;
		}
		public int getEdition() {
			return this.edition;
		}
		public String getISSN() {
			return this.ISSN;
		}
		public String getJID() {
			return this.jID;
		}
	//Setters
		public void setSubType(String subType) {
			this.subType=subType;
		}
		public void setPublication(String publication) {
			this.publication=publication;
		}
		public void setDay(String day) {
			this.day=day;
		}
		public void setEdition(int edition) {
			this.edition=edition;
		}
		public void setISSN(String ISSN) {
			this.ISSN=ISSN;
		}
	
	
}
