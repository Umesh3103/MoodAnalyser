package com.practice;

public class MoodAnalyserException extends Exception {

	enum ExceptionType{
		ENTERED_NULL, ENTERED_EMPTY
	}
	ExceptionType exceptionType;
	public MoodAnalyserException(ExceptionType exceptionType, String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
