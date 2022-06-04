package hust.soict.hedspi.garbage;

import java.lang.Math.*;

public class GarbageCreator {
    private int garbageValue;
    private static int referenceCounter = 0;
    private static int garbageCounter = 0;

    public GarbageCreator() {
        //Random range = [1; 99999]
        this.garbageValue = (int) Math.random() * 99999 + 1;
        referenceCounter++;
    }

    public GarbageCreator(int garbageValue) {
        this.garbageValue = garbageValue;
    }

    public static int getGarbageQuantity() {
        return garbageCounter;
    }

    public static void increaseGarbageQuantity() {
        garbageCounter++;
    }

    public static int getReferenceCounter() {
        return referenceCounter;
    }

    //Finaize method
    public void finalize() {
        referenceCounter--;
        garbageCounter--;
        System.out.println("The garbage instance is collected!");
    }

    public static void main(String[] args) {
        GarbageCreator g1 = new GarbageCreator();
        GarbageCreator g2 = new GarbageCreator();
        GarbageCreator g3 = new GarbageCreator();
        GarbageCreator g4 = new GarbageCreator();
        GarbageCreator g5 = new GarbageCreator();
        GarbageCreator g6 = new GarbageCreator();
        GarbageCreator g7 = new GarbageCreator();
        GarbageCreator g8 = new GarbageCreator();
        GarbageCreator g9 = new GarbageCreator();
        GarbageCreator g10 = new GarbageCreator();

        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();

        g1 = null;
        GarbageCreator.increaseGarbageQuantity();

        g2 = null;
        GarbageCreator.increaseGarbageQuantity();

        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();

        if (GarbageCreator.getGarbageQuantity() >= 5) {
            System.out.println("Too much garbage!");
            System.exit(1);
        }

        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();

        g3 = null;
        GarbageCreator.increaseGarbageQuantity();

        g4 = null;
        GarbageCreator.increaseGarbageQuantity();

        g5 = null;
        GarbageCreator.increaseGarbageQuantity();

        g6 = null;
        GarbageCreator.increaseGarbageQuantity();

        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();
        
        if (GarbageCreator.getGarbageQuantity() >= 5) {
            System.out.println("Too much garbage!");
            System.exit(1);
        }

        System.out.println();
        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();
    }
}
