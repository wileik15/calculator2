package calculator;

import java.util.Scanner;

import calculator_operations.Operation;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = s.nextDouble(); s.nextLine();
		System.out.print("Enter the operator: ");
		String op = s.nextLine();
		System.out.print("Enter the second number: ");
		double b = s.nextDouble();
		
		Operation o = Operation.parseOperator(op);
		if (o == null) {
			System.err.println("Operator not recognized");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of the " + o.getName() + " is " + o.calc());
		}
		s.close();
		
	}
		
}
