package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
import java.math.*;

public class Equations {
	public static void main(String args[]) {
		String choice;
		String strA, strB;
		double a, b, x;
		
		do {
			choice = JOptionPane.showInputDialog(null, "Please select what kind of equations you want to solve" + "\n"
													+ "---------------------------------------------------------------\n"
													+ "First-degree equation with 1 variable                          <1>" + "\n"
													+ "System of first-degree equations with 2 variables     <2>" + "\n"
													+ "Second-degree equation with 2 variables                   <3>" + "\n"
													, "Equation solver",JOptionPane.QUESTION_MESSAGE);
		} while (Integer.parseInt(choice) != 1 && Integer.parseInt(choice) != 2 && Integer.parseInt(choice) != 3);
		
		int key = Integer.parseInt(choice);
		
		switch(key) {
			case 1:
				strA = JOptionPane.showInputDialog(null, "Enter a: ", "First-degree equation with 1 variable ax + b = 0 ", JOptionPane.QUESTION_MESSAGE);
				strB = JOptionPane.showInputDialog(null, "Enter b: ", "First-degree equation with 1 variable ax + b = 0 ", JOptionPane.QUESTION_MESSAGE);
				
				a = Double.parseDouble(strA);
				b = Double.parseDouble(strB);
				x = -b / a;

				JOptionPane.showMessageDialog(null, "The solution of the equation " + a + "x + " + b + " is x = " + x, "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				String strA11, strA12, strA21, strA22, strB1, strB2;
				double a11, a12, a21, a22, b1, b2, d1, d2, d;
				
				strA11 = JOptionPane.showInputDialog(null, "First equation a11*x1 + a12*x2 = b1\nEnter a11: ", "System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				strA12 = JOptionPane.showInputDialog(null, "First equation a11*x1 + a12*x2 = b1\nEnter a12: ", "System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				strB1  = JOptionPane.showInputDialog(null, "First equation a11*x1 + a12*x2 = b1\nEnter b1: " , "System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				strA21 = JOptionPane.showInputDialog(null, "Second equation a21*x1 + a22*x2 = b2\nEnter a21: ","System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				strA22 = JOptionPane.showInputDialog(null, "Second equation a21*x1 + a22*x2 = b2\nEnter a22: ","System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				strB2  = JOptionPane.showInputDialog(null, "Second equation a21*x1 + a22*x2 = b2\nEnter b2: ", "System of first-degree equations with 2 variables", JOptionPane.QUESTION_MESSAGE);
				
				a11 = Double.parseDouble(strA11);
				a12 = Double.parseDouble(strA12);
				b1  = Double.parseDouble(strB1);
				a21 = Double.parseDouble(strA21);
				a22 = Double.parseDouble(strA22);
				b2  = Double.parseDouble(strB2);
				
				d = (a11 * a22) - (a21 * a12);
				d1 = (b1 * a22) - (b2 * a12);
				d2 = (a11 * b2) - (a21 * b1);
				
				if (d == 0) {
					if (d1 == 0 && d2 == 0) JOptionPane.showMessageDialog(null, "Dx = Dy = D = 0, the system has infinitely many solutions", "Equation solver", JOptionPane.INFORMATION_MESSAGE);
					else JOptionPane.showMessageDialog(null, "The system has no solution", "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "D != 0, the system has a unique solution (x1, x2) = (" + (d1 / d) + ", "+ (d2 / d) + ")", "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				String strC;
				double c, x1, x2, delta;
				
				strA = JOptionPane.showInputDialog(null, "Enter a: ", "Second-degree equation with 1 variable ax^2 + bx + c = 0 ", JOptionPane.QUESTION_MESSAGE);
				strB = JOptionPane.showInputDialog(null, "Enter b: ", "Second-degree equation with 1 variable ax^2 + bx + c = 0 ", JOptionPane.QUESTION_MESSAGE);
				strC = JOptionPane.showInputDialog(null, "Enter c: ", "Second-degree equation with 1 variable ax^2 + bx + c = 0 ", JOptionPane.QUESTION_MESSAGE);
				
				a = Double.parseDouble(strA);
				b = Double.parseDouble(strB);
				c = Double.parseDouble(strC);
			
				delta = Math.pow(b, 2) - (4 * a * c);
				
				if (delta == 0) {
					x = -b /(2 * a);
					JOptionPane.showMessageDialog(null, "The equation " + a + "x^2 + " + b + "x + " + c + " has double root x = x1 = x2 = " + x, "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				} else if (delta > 0) {
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					JOptionPane.showMessageDialog(null, "The equation " + a + "x^2 + " + b + "x + " + c + " has two distinct roots\n"
														+ " x1 = " + x1 + "\n"
														+ " x2 = " + x2 + "\n", "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				} else if (delta < 0) {
					JOptionPane.showMessageDialog(null, "The equation has no solution", "Equation solver", JOptionPane.INFORMATION_MESSAGE);
				}
				
				break;
			default:
				break;
		}
		
		System.exit(0);
	}
}
