package org.java.behave.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
