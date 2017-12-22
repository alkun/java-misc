package com.kunzen.java;


public class StringTestKun {
	public static void main(String[] args) {
		String str = "I am Amaresh 'Working in Sony' have 'Five Years'  'residing in Bangalore' for two 'past 10 years' in 'Sarjapur Road'";
		String str1 = str.substring(0, str.indexOf('\''));
		str1 = str1.replace(' ', '\n');
		str = str.substring(str.indexOf(" \'")+1);
		str = str.replace("\'", "\n");
		str = str1 + str;
		System.out.print(str);
		
	}

}
