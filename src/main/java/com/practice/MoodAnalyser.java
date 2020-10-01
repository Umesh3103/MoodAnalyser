package com.practice;

public class MoodAnalyser {
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser problem");
		System.out.println("Updating");
	}
	
	private String message;
	
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException{
		try{
			if(message.length() == 0){
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Enter proper message");
			}
			else if(message.contains("Sad")){
				return "SAD";
			}
			else{
				return "HAPPY";
			}
		}
		catch(NullPointerException e){
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Enter proper message");
		}
	}
}
