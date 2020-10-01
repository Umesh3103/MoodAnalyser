package com.practice;

import org.junit.*;

public class MoodTest {
	
	@Test
	public void givenMessage_WhenSad_shouldGiveSad(){
		String result;
		try{
		MoodAnalyser validator = new MoodAnalyser(null);
		result = validator.analyseMood();
		Assert.assertEquals("SAD",result);
		}
		catch(MoodAnalyserException e){
			System.out.println(e.exceptionType);
			Assert.assertEquals("Enter proper message", e.getMessage());
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
		
	}
}
