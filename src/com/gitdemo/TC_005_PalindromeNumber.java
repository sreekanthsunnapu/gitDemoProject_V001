package com.gitdemo;

public class TC_005_PalindromeNumber {
	public static void main(String[] args) {
		int givenNumber=12345;
		int originalNumber=givenNumber;
		int reverse=0;
		
		while(givenNumber>0) {
			int reminder=givenNumber%10;
			reverse=reverse*10+reminder;
			givenNumber/=10;
		}
		System.out.println("Original Number is: "+originalNumber);
		System.out.println("Reversed Number is: "+reverse);
		
	}

}

