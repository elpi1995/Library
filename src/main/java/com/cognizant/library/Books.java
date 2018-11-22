package com.cognizant.library;

import org.apache.commons.lang3.StringUtils;

public class Books extends Items{
	private static int numOfBooks = 0;
	private String author;
	private String publisher;
	private int edition;
	private String ISBN;
	private String bID = "B"+StringUtils.leftPad(""+numOfBooks,4,"0");
	Books(String title,String month,  int year, String author, String publisher, int edition, String ISBN){
		super(title, month,year);
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.ISBN = ISBN;
		numOfBooks++;
	}
	String type() {
		return "Book";
	}
	String id() {
		return "I"+bID;
	}
	//Getters
	public static int getNumOfBooks() {
		return numOfBooks;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public int getEdition() {
		return this.edition;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public String getBID() {
		return this.bID;
	}
	//Setters
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setEdition(int edition) {
		this.edition =edition;
	}
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
}
