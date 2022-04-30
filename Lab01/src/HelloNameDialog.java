import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String args[]) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hi " + result + "!\nHave a good day!", "Hello", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
