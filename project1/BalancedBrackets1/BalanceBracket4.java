package com.gl.LabAssignment3.project1.BalancedBrackets1;

public class BalanceBracket4 {
static void examine(String brackets) {
	BalancedBracket1 checker=new BalancedBracket1(brackets) ;
	boolean result=checker.check();
	if(result) {
		System.out.println("bracket expression "+brackets+" is balanced");
	}else {
		System.out.println("bracket expression "+brackets+" is not balanced");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		examine("");
		examine("([[{}]])");
		examine("[]");
		examine("[)");
		examine("[[[]]]");
		examine("M{{[[[()]]]}}W");
		examine("M{{[[[()]]]}}");
	}

}
