package com.cognizant.library;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Items {
	abstract String type();
	abstract String id();
	private String title;
	private String month;
	private int year;
	static HashMap<String,Items> items = new HashMap<String,Items>();
	Items(String title,String month,int year){
		this.title = title;
		this.month = month;
		this.year = year;
		items.put(id(), this);
	}
	//Getters
	public String getTitle() {
		return this.title;
	}
	public int getYear() {
		return this.year;
	}
	public String getMonth() {
		return this.month;
	}
	//Add item
	public static String addItem(String title,String month,  int year, String author, String publisher, int edition, String ISBN) {
		Books book = new Books(title,month,year, author, publisher, edition,ISBN);
		
		return book.getTitle();
	}
	public static String addItem(String frontPage,String month,  int year,String subType,String publication,int edition,String day,String ISSN) {
		Journals journal = new Journals(frontPage,month,year, subType, publication, edition,day,ISSN);
		
		return journal.getTitle();
	}
	public static String addItem(String headline,String month,int year,String editor,String publication, String day,String country) {
		Newspapers newspaper = new Newspapers(headline,month,year, editor, publication, day,country);
		
		return newspaper.getTitle();
	}
	//Delete item
	public static boolean deleteItem(String id) {
		items.remove(id);
		return items.containsKey(id);
		
	}
	//Update
	public static void updateItem(String id) {
	
	}
	
	
}
