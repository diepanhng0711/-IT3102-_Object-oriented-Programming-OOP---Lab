package hust.soict.hedspi.aims.utils;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DateTest {
	public String accept() {
		String s = JOptionPane.showInputDialog(null, "Please enter the string", "Converter", JOptionPane.INFORMATION_MESSAGE);
		return s;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		
		while(true) {
			System.out.println("=============>>> MY DATE <<<=============");
			System.out.println(" 1. Get current date");
			System.out.println(" 2. Set date using Int variables");
			System.out.println(" 3. Set date using a string");
			System.out.println(" 4. Set date using day/month/year's names");
			System.out.println(" 5. Get current date with format chosen by the user");
			System.out.println(" 6. Quit");
			System.out.print("\n  ---> Please enter your choice: ");
			key = sc.nextInt();
			System.out.println();
			
			switch(key) {
				case 1:
					System.out.println(" 1. Get current date");
					MyDate md1 = new MyDate(); 
					md1.printDate();
					System.out.println();
					break;
				case 2:
					System.out.println(" 2. Set date using Int variables");
					System.out.println(" ??? -> Please enter Date -> Month -> Year: \n");
					System.out.print("Date = ");
					int nd = sc.nextInt();
					while (nd <= 0 || nd > 31) {
						System.out.print("Date = ");
						nd = sc.nextInt(); 
					}
					System.out.print("Month = ");
					int nm = sc.nextInt();
					while (nm <= 0 || nm > 12) {
						System.out.print("Month = ");
						nm = sc.nextInt();
					}
					System.out.print("Year = ");
					int ny = sc.nextInt();
					MyDate md2 = new MyDate(nd, nm, ny);
					System.out.println();
					md2.printDate();
					System.out.println();
					break;
				case 3:
					System.out.println(" 3. Set date using a string");
					System.out.println(" ??? -> Please enter the date string with the correct syntax <e.g: January 31st 2022>\n");
					System.out.print("Date = ");
					
					DateTest dt = new DateTest();
					String s = dt.accept();
					MyDate md3 = new MyDate(s);
					md3.printDate();
					System.out.println();
					break;
				case 4:
					System.out.println(" 4. Set date using day/month/year's names");
					//Scanner sc1 = new Scanner(System.in);
					//System.out.print("Day: ");
					String inday = JOptionPane.showInputDialog(null, "Day: ", "Inserting", JOptionPane.QUESTION_MESSAGE);
					//sc1.close();
					//Scanner sc2 = new Scanner(System.in);
					//System.out.print("Month: ");
					String inmonth = JOptionPane.showInputDialog(null, "Month: ", "Inserting", JOptionPane.QUESTION_MESSAGE);
					//sc2.close();
					//Scanner sc3 = new Scanner(System.in);
					//System.out.print("Year: ");
					String inyear = JOptionPane.showInputDialog(null, "Year: ", "Inserting", JOptionPane.QUESTION_MESSAGE);
					//sc3.close();

					MyDate md4 = new MyDate(inday, inmonth, inyear);
					System.out.println();
					md4.printDate();
					System.out.println();
					break;
				case 5:
					MyDate md5 = new MyDate();
					System.out.println("Please choose what date format that you want: ");
					System.out.println(" ---> 1. yyyy-MM-dd");
					System.out.println(" ---> 2. d/M/yyyy");
					System.out.println(" ---> 3. dd-MMM-yyyy");
					System.out.println(" ---> 4. MMM d yyyy");
					System.out.println(" ---> 5. mm-dd-yyyy");
					System.out.print("\n <?> Your choice: ");
					int choice = sc.nextInt();
					System.out.println();
					md5.choosePrintingFormat(choice);
					System.out.println();
					break;
				case 6:
					System.out.println("Exiting the program... Have a good day!");
					System.out.println("=========================================");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Wrong choice! Please enter your choice again!!!\n");
					System.out.println();
					break;
			}	
		}
	}
}
