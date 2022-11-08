package com.gl.LabAssignment3.project1.BalancedBrackets1;
import java.util.*;
public class BlanceBracket3 {
	static Set<BalanceBracket2>BalanceBracket2Set =new HashSet<>();
	static {
		BalanceBracket2 one=new BalanceBracket2('(',')');
		BalanceBracket2 two=new BalanceBracket2('[',']');
		BalanceBracket2 three=new BalanceBracket2('{','}');
		BalanceBracket2Set.add(one);
		BalanceBracket2Set.add(two);
		BalanceBracket2Set.add(three);
	}
	static BalanceBracket2 getBalanceBracket2(Character closeBalanceBracket2) {
		for(BalanceBracket2 aBalanceBracket2:BalanceBracket2Set) {
			if(aBalanceBracket2.getCloseChar().equals(closeBalanceBracket2)) {
				return aBalanceBracket2;
			}
		}
		return null;
	
	}
	static Set<Character>getOpenBrackets(){
		
	Set<Character>results=new HashSet<>();
	for(BalanceBracket2 aBalanceBracket2:BalanceBracket2Set) {
		results.add(aBalanceBracket2.getOpenChar());
		
		  }return results;
	}
	static Set<Character>getClosedBrackets(){
		
	Set<Character>results=new HashSet<>();
	for(BalanceBracket2 aBalanceBracket2:BalanceBracket2Set) {
		results.add(aBalanceBracket2.getCloseChar());
	}return results;
}}
