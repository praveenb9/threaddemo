package com.capg.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTest {
	static Student obj=new Student();
@BeforeAll
	public static void getObject()
	{
		obj.setSid(121);
		obj.setSname("akhil");
		obj.setMarks(90);
		
	}
	@Test
	void testGetSid() {
assertEquals(121,obj.getSid());
	}

	@Test
	void testGetSname() {
		assertEquals("akhil",obj.getSname());	
	}

	@Test
	void testGetMarks() {
		assertEquals(90,obj.getMarks());
	}

}
