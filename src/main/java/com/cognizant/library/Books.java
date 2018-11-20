package com.cognizant.library;

import org.apache.commons.lang3.StringUtils;

public class Books {
	private static int numOfBooks = 0;
	private String title;
	private String author;
	private String publisher;
	private int edition;
	private String month;
	private int year;
	private String ISBN;
	private String bID = "B"+StringUtils.leftPad(""+numOfBooks,4,"0");
	Books(String title, String author, String publisher, int edition,String month,  int year, String ISBN){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.month = month;
		this.year = year;
		this.ISBN = ISBN;
		numOfBooks++;
	}
	//Getters
	public static int getNumOfBooks() {
		return numOfBooks;
	}
	public String getTitle() {
		return this.title;
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
	public int getYear() {
		return this.year;
	}
}
