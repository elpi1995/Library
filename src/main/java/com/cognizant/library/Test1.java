package com.cognizant.library;
import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Test1 {
	@Test
	public void idIncrementTest() {
		int idBefore = Books.getNumOfBooks();
		Books booky = new Books("t","m",1,"a","p",1,"i");
		assertEquals("Id increment:" , idBefore+1,Books.getNumOfBooks());
		}
	@Test
	public void idGeneratorTest() {
		int idBefore = Books.getNumOfBooks();
		Books booky = new Books("t","m",1,"a","p",1,"i");
		
		String idGenBefore = "B"+StringUtils.leftPad(""+(Books.getNumOfBooks()),4,"0");
		assertEquals("Book id generation: ","B"+StringUtils.leftPad(""+(idBefore+1),4,"0"), idGenBefore);
		
	}
	@Test
	public void addItemTest() {
		String title = "t";
		ItemsManager im = new ItemsManager();
		assertEquals("Book addition: ",title, im.addItem("t","m",1,"a","p",1,"i"));
	}
	@Test
	public void deleteItemTest() {
		ItemsManager im = new ItemsManager();
		im.addItem("t","m",1,"a","p",1,"i");
		boolean s = im.deleteItem("IB0000");
		assertEquals("Book deletion: ",false,s);
	}
	@Test 
	public void updateMemberFirstNameTest() {
		MembersManager mm = new MembersManager();
		mm.addMember("f", "l", "pc", "a", "tC", "c", "c", "dyb", "mB", "1995", "P");
		String name = mm.updateMemberFirstName("M0000", "Larry");
		assertEquals("member update: ","Larry", name);
		
	}
	@Test 
	public void substringTest() {
		assertEquals("member update: ","f", "first".substring(0, 1));
		
	}
}
