package com.cloudvandana.assignment;

import java.util.Scanner;

public class Pangram {

	public static boolean isPangram(String pangram) {
		pangram = pangram.toLowerCase();
		if(pangram.length() < 26) {
			return false;
		}
		for(char ch = 'a'; ch <= 'z'; ch++) {
			if(pangram.indexOf(ch) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence/word");
		if(isPangram(scan.nextLine())) {
			System.out.println("This is a Pangram");
		}
		else {
			System.out.println("This is not a Pangram");
		}
	}
}
