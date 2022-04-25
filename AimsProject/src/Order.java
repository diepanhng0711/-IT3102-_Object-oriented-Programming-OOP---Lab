
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	private int qtyOrdered = 0;
	
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    
    public int getQtyOrdered () {
    	return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println(disc.getTitle() + " has benn added!");
        } else {
            System.out.println("The order is already full!");
        }
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(disc.getTitle().equals(itemsOrdered[i].getTitle())) {
                for(int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                System.out.println(disc.getTitle() + " has been deleted!");
                return;
            }
        }
        System.out.println(disc.getTitle() + " is not exist!");
    }
    
    public float totalCost() {
        float total = 0.0f;
        for(int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
