package com.practice;

public class MoodAnalyser {
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser problem");
		
	}
	
	private String message;
	
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood(){
		try{
			if(message.contains("Sad")){
				return "SAD";
			}
			else{
				return "HAPPY";
			}
		}
		catch(Exception e){
			return "HAPPY";
		}
	}
}
