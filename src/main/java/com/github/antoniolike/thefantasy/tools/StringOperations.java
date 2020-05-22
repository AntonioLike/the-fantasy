package com.github.antoniolike.thefantasy.tools;

import java.util.Arrays;

public abstract class StringOperations {
	
	public static boolean areAnadromes(String a, String b) {
		if(a != null && b != null && a.length()==b.length()) {
			char[] aArray = a.toLowerCase().toCharArray();
			char[] bArray = b.toLowerCase().toCharArray();
			Arrays.sort(aArray);
			Arrays.sort(bArray);
			if(Arrays.equals(aArray, bArray))
				return true;
		}
		return false;
	}
	
	public static boolean arePalindromes(String a, String b) {		
		if(a != null && b != null && a.length()==b.length()) {
			String a1 = a.toLowerCase();
			String b1 = b.toLowerCase();
			for(int i = 0; i<a1.length(); i++) {
				if(a1.charAt(i)!=b1.charAt(a1.length()-i-1))
					return false;
			}
			return true;
		}
		return false;		
	}
	
	public static boolean arePalindromesIgnoreNonAlphaNumeric(String a, String b) {
		return arePalindromes(a.replaceAll("[^a-zA-Z0-9_]", ""), b.replaceAll("[^a-zA-Z0-9_]", ""));
	}

	public static String concatenateStringsDelimitator(String delimitator, String ...strings) {
		if(strings == null || strings.length == 0)
			return null;
		StringBuilder sb = new StringBuilder();
		if(delimitator==null || delimitator.length()==0)
			for(String s:strings) 
				sb.append(s);
		else {
			for(String s:strings) {
				sb.append(s).append(delimitator);
			}
			sb.delete(sb.length()-delimitator.length()-1, sb.length()-1);
		}
		
		return sb.toString();
	}
	
	public static String concatenateStrings(String... strings) {
		return concatenateStringsDelimitator(null,strings);
	}
	
	public static String concatenateStringsPlusFinalDot(String ...strings) {
		return concatenateStrings(strings) + ".";
	}
	
	
	
	
}
