package com.gl.LabAssignment3.project1.BalancedBrackets1;

public class BalanceBracket2 {
private Character openChar;
private Character closeChar;

public  BalanceBracket2(Character openChar,Character closeChar) {
	this.openChar=openChar;
	this.closeChar=closeChar;
}
public Character getOpenChar() {
	return openChar;
}
public void setOpenChar(Character openChar) {
	this.openChar = openChar;
}
public Character getCloseChar() {
	return closeChar;
}
public void setCloseChar(Character closeChar) {
	this.closeChar = closeChar;
}


}
