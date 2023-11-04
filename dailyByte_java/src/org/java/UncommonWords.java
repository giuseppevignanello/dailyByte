//Given two strings representing sentences, 
//return the words that are not common to both strings 
//(i.e. the words that only appear in one of the sentences). 
//You may assume that each sentence is a sequence of words (without punctuation) 
//correctly separated using space characters.

package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UncommonWords {

	public static List<String> uncommonWords(String sentence1, String sentence2 ) {
		
		//splitting the sentences 
		  Set<String> splittedSentence1 = new HashSet<>(Arrays.asList(sentence1.split(" ")));
		  Set<String> splittedSentence2 = new HashSet<>(Arrays.asList(sentence2.split(" ")));
		
		//creating a List for the result
		List <String> result = new ArrayList<>();
		
		
		//checking if the second list have each first list's words and vice versa
		for (String word : splittedSentence1) {
			if(!splittedSentence2.contains(word)) {
				result.add(word);
			}
		}
		for(String word: splittedSentence2) {
			if(!splittedSentence1.contains(word)) {
				result.add(word);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(uncommonWords("the quick", "brown fox"));
		System.out.println(uncommonWords("the tortoise beat the haire", "the tortoise lost to the haire"));
		System.out.println(uncommonWords("copper coffee pot", "hot coffee pot"));
	}
}
