package hust.soict.hedspi.garbage;

public class NoGarbage{
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
            System.gc();
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
            System.gc();
        }

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }

        System.out.println();
        System.out.println("getReferenceCounter: " + GarbageCreator.getReferenceCounter());
        System.out.println("getGarbageQuantity: " + GarbageCreator.getGarbageQuantity());
        System.out.println();
    }
}
