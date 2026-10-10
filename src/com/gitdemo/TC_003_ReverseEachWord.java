package com.gitdemo;

public class TC_003_ReverseEachWord {
	public static void main(String[] args) {
		String statement="Sreekanth Sunnapu is from India";
		String words[]=statement.split(" ");
		
		System.out.println("Original Sentence: "+statement);
		System.out.print("Reversed Sentence: ");
		for(String word :words) {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--) {
				reverse=reverse+word.charAt(i);
			}
			System.out.print(reverse+" ");
		}
<<<<<<< HEAD
		
	}

=======
	}
>>>>>>> refs/heads/Feature-Login
}
