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

}
