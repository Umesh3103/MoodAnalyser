package com.practice;

import org.junit.*;


public class MoodTest {
	
	@Test
	public void givenMessage_WhenSad_shouldGiveSad(){
		MoodAnalyser validator = new MoodAnalyser("I am in Happy mood");
		String result = validator.analyseMood();
		Assert.assertEquals("HAPPY",result);
	}
}
