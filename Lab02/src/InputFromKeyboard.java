   

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What's your name?");
    String strName = keyboard.nextLine();
    System.out.println("How old are you?");
    int iAge = keyboard.nextInt();
    System.out.println("How tall are you?");
    double dHeight = keyboard.nextDouble();
    
    System.out.println("Your profile:");
    System.out.println("Name: " + strName);
    System.out.println("Age: " + iAge);
    System.out.println("Height: " + dHeight);    

    keyboard.close();
    }
}
