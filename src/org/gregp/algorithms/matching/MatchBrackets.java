package org.gregp.algorithms.matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MatchBrackets {
	
	public static List<Character> OPEN_BRACKETS = new ArrayList<Character>();
	static {
		OPEN_BRACKETS.add('{');
		OPEN_BRACKETS.add('(');
		OPEN_BRACKETS.add('[');
	}
	
	public static List<Character> CLOSED_BRACKETS = new ArrayList<Character>();
	static {
		CLOSED_BRACKETS.add('}');
		CLOSED_BRACKETS.add(')');
		CLOSED_BRACKETS.add(']');
	}
	
	public boolean validBrackets(String value) {
		Stack<Character> bracketStack = new Stack<Character>();
		for(int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			int cbi = CLOSED_BRACKETS.indexOf(c);
			if(OPEN_BRACKETS.contains(c)) {
				bracketStack.add(c);
			} else if(cbi > -1) {
				if(bracketStack.isEmpty() || bracketStack.peek() != OPEN_BRACKETS.get(cbi)) {
					return false;
				} else {
					bracketStack.pop();
				}
			}
		}
		return true;
	}

}
