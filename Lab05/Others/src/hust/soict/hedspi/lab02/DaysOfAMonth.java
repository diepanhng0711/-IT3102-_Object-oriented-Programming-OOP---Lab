package hust.soict.hedspi.lab02;

import javax.swing.JOptionPane;

public class DaysOfAMonth {
    public static void main(String[] args) {
        
        String nYear, nMonth;
        int year;

        nYear = JOptionPane.showInputDialog(null, "Please enter the year: ", "Days of a month", JOptionPane.QUESTION_MESSAGE);

        while (Integer.parseInt(nYear) < 0 || Integer.parseInt(nYear) > 99999) {
            nYear = JOptionPane.showInputDialog(null, "Wrong input!\nPlease enter the year: ", "Days of a month", JOptionPane.WARNING_MESSAGE);
        } 
        year = Integer.parseInt(nYear);

        nMonth = JOptionPane.showInputDialog(null, "Please enter the month: ", "Days of a month", JOptionPane.QUESTION_MESSAGE);
        
        switch (nMonth) {
            case "1", "January", "Jan", "Jan.":
                JOptionPane.showInternalMessageDialog(null, "January of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "2", "February", "Feb", "Feb.":
                if (year % 4 == 0) {
                    JOptionPane.showInternalMessageDialog(null, "February of " + year + " has 29 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showInternalMessageDialog(null, "February of " + year + " has 28 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "3", "March", "Mar", "Mar.":
                JOptionPane.showInternalMessageDialog(null, "March of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "4", "April", "Apr", "Apr.":
                JOptionPane.showInternalMessageDialog(null, "April of " + year + " has 30 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "5", "May", "May.":
                JOptionPane.showInternalMessageDialog(null, "May of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "6", "June", "Jun":
                JOptionPane.showInternalMessageDialog(null, "June of " + year + " has 30 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "7", "July", "Jul":
                JOptionPane.showInternalMessageDialog(null, "July of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "8", "August", "Aug", "Aug.": 
                JOptionPane.showInternalMessageDialog(null, "August of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "9", "September", "Sep", "Sept.":
                JOptionPane.showInternalMessageDialog(null, "September of " + year + " has 30 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "10", "October", "Oct", "Oct.":
                JOptionPane.showInternalMessageDialog(null, "October of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "11", "November", "Nov", "Nov.":
                JOptionPane.showInternalMessageDialog(null, "November of " + year + " has 30 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "12", "December", "Dec", "Dec.":
                JOptionPane.showInternalMessageDialog(null, "Decemberr of " + year + " has 31 days!", "Days of a month", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong input!\n", "Days of a month", JOptionPane.ERROR_MESSAGE);  
                break; 
        }
    }
}
