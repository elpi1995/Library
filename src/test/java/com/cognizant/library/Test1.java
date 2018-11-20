package com.cognizant.library;
import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Test1 {
	@Test
	public void idIncrementTest() {
		int idBefore = Books.getNumOfBooks();
		Books booky = new Books("t","a","p",1,"m",1,"i");
		assertEquals("Id increment:" , idBefore+1,Books.getNumOfBooks());
		}
	@Test
	public void idGeneratorTest() {
		int idBefore = Books.getNumOfBooks();
		Books booky = new Books("t","a","p",1,"m",1,"i");
		
		String idGenBefore = "B"+StringUtils.leftPad(""+(Books.getNumOfBooks()),3,"0");
		assertEquals("B"+StringUtils.leftPad(""+idBefore+1,3,"0"), idGenBefore);
		
	}
	
}
