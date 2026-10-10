package com.gitdemo;

public class TC_004_CountVowelsInString {
	public static void main(String[] args) {
		String name="sreekanth Sunnapu";
		int vowelsCount=0;
		for(int i=0;i<name.length();i++) {
			char ch=Character.toLowerCase(name.charAt(i));
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelsCount++;
			}
		}
		System.out.println("Number of Vowels in Given Name: "+vowelsCount);
	}

}
