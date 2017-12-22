package com.kunzen.java;


public class StringTest1 {
public static void main(String[] args) {
	String str= "I am Amaresh \"Working in Sony\" have \"Five Years\" Exp";
	int pos = str.indexOf("\"");
	
	int j = 0;
	System.out.println(pos);
	if (str.contains("\"")) {
		while (str.contains("\"")) {
			if (str.indexOf("\"") > 0 && j/2==0) {
				String first = str.substring(0, str.indexOf("\""));
				printValues(first);
				str = str.substring(str.indexOf("\""), str.length());
				str = str.trim();
				j++;
			} else if (str.indexOf("\"") > 0 && j/2 == 1) {
				String first = str.substring(0, str.indexOf("\""));
				System.out.println(first);
				str = str.substring(str.indexOf("\""), str.length());
				str = str.trim();
				j++;
			} else if (str.indexOf("\"") == 0 ){
				str = str.substring(1);
				String second = str.substring(0, str.indexOf("\""));
				System.out.println(second);
				str= str.substring(str.indexOf("\"") +1, str.length());
				str = str.trim();
			} else {
				System.out.println(str);
			}
		}
	} else {
		String[] strArr = str.split(" ");
		for(String st:strArr){
			System.out.println(st);
		}
	}
	
	if (str.length() > 0) {
		printValues(str);
	}
}

private static void printValues(String first) {
	// TODO Auto-generated method stub
	String[] strArr = first.split(" ");
	for(String st:strArr){
		System.out.println(st);
	}
}
}
