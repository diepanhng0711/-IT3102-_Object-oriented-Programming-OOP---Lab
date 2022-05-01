package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String args[]) {
		String strNum1, strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.QUESTION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.QUESTION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		JOptionPane.showMessageDialog(null, "Sum = " + (num1 + num2) + "\n"
											+ "Difference = " + (num1 - num2) + "\n"
											+ "Product = " + (num1 * num2) + "\n"
											+ "Quotient = " + (num1 / num2), "Calculator", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
