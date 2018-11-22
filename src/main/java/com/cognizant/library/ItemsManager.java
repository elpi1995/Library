package com.cognizant.library;

public class ItemsManager {
	//Add item
		public String addItem(String title,String month,  int year, String author, String publisher, int edition, String ISBN) {
			Books book = new Books(title,month,year, author, publisher, edition,ISBN);
			
			return book.getTitle();
		}
		public String addItem(String frontPage,String month,  int year,String subType,String publication,int edition,String day,String ISSN) {
			Journals journal = new Journals(frontPage,month,year, subType, publication, edition,day,ISSN);
			
			return journal.getTitle();
		}
		public String addItem(String headline,String month,int year,String editor,String publication, String day,String country) {
			Newspapers newspaper = new Newspapers(headline,month,year, editor, publication, day,country);
			return newspaper.getTitle();
		}
	//Delete item
		public boolean deleteItem(String id) {
			Items.getItems().remove(id);
			return Items.getItems().containsKey(id);
			
		}
	//Update
	//________________________________________________________________
	//Items
		public String updateItemTitle(String id,String title) {
			Items.getItems().get(id).setTitle(title);
			return Items.getItems().get(id).getTitle();
			
		}
		public String updateItemMonth(String id,String month) {
			Items.getItems().get(id).setMonth(month);
			return Items.getItems().get(id).getMonth();
			
		}
		public int updateItemYear(String id,int year) {
			Items.getItems().get(id).setYear(year);
			return Items.getItems().get(id).getYear();
			
		}
	//Books
		public String updateBookAuthor(String id,String author) {
			((Books) Items.getItems().get(id)).setAuthor(author);
			return ((Books) Items.getItems().get(id)).getAuthor();
			
		}
		public String updateBookPublisher(String id,String publisher) {
			((Books) Items.getItems().get(id)).setPublisher(publisher);
			return ((Books) Items.getItems().get(id)).getPublisher();
			
		}
		public int updateBookEdition(String id,int edition) {
			((Books) Items.getItems().get(id)).setEdition(edition);
			return ((Books) Items.getItems().get(id)).getEdition();
			
		}
		public String updateBookISBN(String id,String ISBN) {
			((Books) Items.getItems().get(id)).setISBN(ISBN);
			return ((Books) Items.getItems().get(id)).getISBN();
			
		}
	//Newspapers
		public String updateNewspaparPublication(String id,String publication) {
			((Newspapers) Items.getItems().get(id)).setPublication(publication);
			return ((Newspapers) Items.getItems().get(id)).getPublication();
			
		}
		public String updateNewspaparEditor(String id,String editor) {
			((Newspapers) Items.getItems().get(id)).setEditor(editor);
			return ((Newspapers) Items.getItems().get(id)).getEditor();
			
		}
		public String updateNewspaparDay(String id,String day) {
			((Newspapers) Items.getItems().get(id)).setDay(day);
			return ((Newspapers) Items.getItems().get(id)).getDay();
			
		}
		public String updateNewspaparCountry(String id,String country) {
			((Newspapers) Items.getItems().get(id)).setCountry(country);;
			return ((Newspapers) Items.getItems().get(id)).getCountry();
			
		}
	//Journals
		public String updateJournalSubType(String id,String subType) {
			((Journals) Items.getItems().get(id)).setSubType(subType);
			return ((Journals) Items.getItems().get(id)).getSubType();
		}
		
		public String updateJournalPublication(String id,String publication) {
			((Journals) Items.getItems().get(id)).setPublication(publication);
			return ((Journals) Items.getItems().get(id)).getPublication();
		}
		public String updateJournalDay(String id,String day) {
			((Journals) Items.getItems().get(id)).setDay(day);
			return ((Journals) Items.getItems().get(id)).getDay();
			
		}
		public int updateJournalEdition(String id,int edition) {
			((Journals) Items.getItems().get(id)).setEdition(edition);
			return ((Journals) Items.getItems().get(id)).getEdition();
			
		}
		public String updateJournalISSN(String id,String ISSN) {
			((Journals) Items.getItems().get(id)).setISSN(ISSN);
			return ((Journals) Items.getItems().get(id)).getISSN();
			
		}
			
}
