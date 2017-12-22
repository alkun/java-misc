package com.kunzen.java;

public class StringTestKun2 {
	public static void main(String[] args) {
		String str = "I am Amaresh 'Working in Sony' 'have Five Years' Exp in Android 'residing in Bangalore' for almost 'past 10 years'";
		String[] str1 =str.split("([\\s'+]+)");
		for(String st:str1){
			System.out.println(st);
		}
	}
}
