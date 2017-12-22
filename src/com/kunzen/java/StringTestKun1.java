package com.kunzen.java;

public class StringTestKun1 {
	public static void main(String[] args) {
		String str = "I am Amaresh 'Working in Sony' 'have Five Years' Exp in Android 'residing in Bangalore' for almost 'past 10 years'";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ' && str.charAt(i)!='\''){
				System.out.print(str.charAt(i));
			}
			if(str.charAt(i)==' '){
				System.out.println(str.charAt(i));
			}
			else if(str.charAt(i)=='\''){
				String strquote=str.substring(i, str.indexOf('\'', i+1));
				System.out.print(strquote.substring(1).trim());
				i=i+strquote.length();
			}
		}
	}
}
