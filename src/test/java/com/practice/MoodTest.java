package com.practice;

import org.junit.*;


public class MoodTest {
	
	@Test
	public void givenMessage_WhenSad_shouldGiveSad(){
		MoodAnalyser validator = new MoodAnalyser();
		String result = validator.analyseMood("This is a sad message");
		Assert.assertEquals("SAD",result);
	}
}
