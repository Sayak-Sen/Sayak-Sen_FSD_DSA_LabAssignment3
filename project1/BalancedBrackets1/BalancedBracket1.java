package com.gl.LabAssignment3.project1.BalancedBrackets1;

import java.util.*;

public class BalancedBracket1 {
	private String brackets;
	private Set<Character> openBracketsSet;
	private Set<Character> closedBracketsSet;
	private Stack<Character>bracketsStack;
	public BalancedBracket1(String brackets) {
		this.brackets=brackets;
		
		closedBracketsSet=new HashSet<>();
		bracketsStack=new Stack<>();
		}
	public boolean check() {
		if(brackets.length()==0) {
			return false;
		}
		if(brackets.length()%2 !=0) {
			return false;
		}
		openBracketsSet=BlanceBracket3.getOpenBrackets();
		closedBracketsSet=BlanceBracket3.getClosedBrackets();
	for(int index=0;index<brackets.length();index++) {
		char aCharacter=brackets.charAt(index);
		//check open brackets( { [
		// for matches
		if(openBracketsSet.contains(aCharacter)) {
			bracketsStack.push(aCharacter);
		}else if (closedBracketsSet.contains(aCharacter)) {
			BalanceBracket2 balanceBracket2Obj= BlanceBracket3.getBalanceBracket2(aCharacter);
		Character openBracketCharFromStack=bracketsStack.pop();
		if(balanceBracket2Obj.getOpenChar().equals(openBracketCharFromStack)) {
			
		}else {
			return false;
		}
		}
		
	}boolean successCondition=bracketsStack.isEmpty();
	if(successCondition) {
		return true;
	}else {
		return false;
	}
	}
	}
		
	

