package prabu;

import java.util.Scanner;

public class Reverse_String {
	
	
	public static void reverse(String word) {
		
		
		
		//Scanner s= new Scanner(System.in);
		
		//System.out.println("Enter the Word: ");
		
		//String word = s.nextLine();
		
		
		
		System.out.println("Original Word: "+word);
		
		
		System.out.print("After Reverse: ");
		for (int i = word.length()-1; i >=0; i--) {
			
			char eL = word.charAt(i);
			
			System.out.print(eL);
			
		}
		
		
//		String word="Pranitha";
//		
//		
//		//ahtinarP
//		
//		int wordSize = word.length();
//		
//		System.out.println(wordSize);
//		
//		System.out.println("Original Word: ");
//		
//		
//		for (int i = 0; i < wordSize; i++) {
//			
//			char eachLetter = word.charAt(i);
//			
//			System.out.print(eachLetter);
//			
//		}
//		System.out.println();
//		System.out.println("After Reverse: ");
//		for (int i = wordSize-1; i >=0; i--) {
//			
//			char eL = word.charAt(i);
//			
//			System.out.print(eL);
//			
//		}
	}
	
	public static void main(String[] args) {
		
		reverse("Christy Priyanka");
		
		//Christy Priyanka
		
		//ytsirhC  aknayirP
		
		
		
	}

}
