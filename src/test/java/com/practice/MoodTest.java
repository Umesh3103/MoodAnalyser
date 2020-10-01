package com.practice;

import org.junit.*;


public class MoodTest {
	
	@Test
	public void givenMessage_WhenSad_shouldGiveSad(){
		MoodAnalyser validator = new MoodAnalyser();
		String result = validator.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY",result);
	}
}
