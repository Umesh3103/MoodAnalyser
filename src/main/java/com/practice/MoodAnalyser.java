package com.practice;

public class MoodAnalyser {
	public static void main(String[] args) {
		System.out.println("Welcome to mood analyser problem");
		
	}
	
	public String analyseMood(String message){
		if(message.contains("Sad")){
			return "SAD";
		}
		else{
			return "HAPPY";
		}
	}
}
