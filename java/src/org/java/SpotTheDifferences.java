package org.java;



public class SpotTheDifferences {
	
	public static String spotTheDifferences(String s, String t) {
		
		for (char tChar : t.toCharArray()) {
			if(!s.contains(String.valueOf(tChar))) {
				return String.valueOf(tChar);
			}
		}
		
		return " ";
		
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(spotTheDifferences("foobar", "barfoot"));
		System.out.println(spotTheDifferences("ide", "idea"));
		System.out.println(spotTheDifferences("coding", "ingcod"));
	}
	
	
	
	
}
