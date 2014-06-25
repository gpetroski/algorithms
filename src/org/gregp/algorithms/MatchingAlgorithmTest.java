package org.gregp.algorithms;

import org.gregp.algorithms.matching.MatchBrackets;

public class MatchingAlgorithmTest {

	public static void main(String[] args) {
		MatchBrackets alg = new MatchBrackets();
		
		String input1 = "{asdf{fdd(adfd)dfadfs}}";
		System.out.println(input1 + ": " + alg.validBrackets(input1));
		
		String input2 = "[](){}[asdf]";
		System.out.println(input2 + ": " + alg.validBrackets(input2));
		
		String input3 = "asdf";
		System.out.println(input3 + ": " + alg.validBrackets(input3));
		
		String input4 = "]]]";
		System.out.println(input4 + ": " + alg.validBrackets(input4));
		
		String input5 = "[(])";
		System.out.println(input5 + ": " + alg.validBrackets(input5));
	}
}
