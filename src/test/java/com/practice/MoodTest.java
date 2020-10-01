package com.practice;

import org.junit.*;

public class MoodTest {
	
	@Test
	public void givenMessage_WhenSad_shouldGiveSad(){
		String result;
		try{
		MoodAnalyser validator = new MoodAnalyser("hello world");
		result = validator.analyseMood();
		Assert.assertEquals("HAPPY",result);
		}
		catch(MoodAnalyserException e){
			Assert.assertEquals("Enter proper message", e.getMessage());
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
	}
}
