package hust.soict.hedspi.aims.order;
import java.util.ArrayList;
import java.util.Random;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;

    public static final int MAX_LIMITED_ORDERS = 5;
    
    private static int nbOrders = 0;
	
	private int qtyOrdered = 0;
	
    //private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


    public Order() {
        if (nbOrders >= 5) {
            System.out.println("Full of orders! Cannot add another order!");
            return ;
        }
        nbOrders++;
        System.out.println("A new order has been created!");
    }

    public static int getNumberOfOrders() {
        return nbOrders;
    }
    
    public int getQtyOrdered () {
    	return this.qtyOrdered;
    }

    /*public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }*/

    public Media getMedia(int index) {
        return itemsOrdered.get(index);
    }

    public void addMedia(Media media) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            qtyOrdered++;
            System.out.println("The new media has been added successfully!");
        } else {
            System.out.println("The order is already full!");
        }
    }


    //Optimizing code for addMedia method
    /*
    public void addMedia(Media media) {
        if (!this.itemsOrdered.contains(media)) {
            this.itemsOrdered.add(media);
        }
    }
    */

    //xóa đĩa trực tiếp theo tham chiếu
    public void removeMedia(Media media) {
        if (qtyOrdered == 0) {
            System.out.println("Empty media list!");
        } else {
            itemsOrdered.remove(media);
            qtyOrdered--;
            System.out.println("Removed [" + media.getTitle() + "] successfully!");
        }
    }
    
    //xóa đĩa theo chỉ số index
    public void removeMedia(int index) {
        if (qtyOrdered == 0) {
            System.out.println("Empty media list!");
        } else {
            itemsOrdered.remove(itemsOrdered.get(index));
            qtyOrdered--;
            System.out.println("Removed [" + index + "] successfully!");
        }
    }

    public void removeMedia(String id) {
        if (qtyOrdered == 0) {
            System.out.println("Empty media list!");
        } else {
            int checkflag = 0;
            for (Media item: itemsOrdered) {
                String comID = new String(item.getId());
                if(id.equals(comID)) {
                    itemsOrdered.remove(item);
                    qtyOrdered--;
                    checkflag = 1;
                    break;
                }
            }
            
            if (checkflag == 1) System.out.println("Removed [" + id + "] successfully!");
            else System.out.println("Cannot find the media with the ID [" + id + "] in this order list!" );
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for(Media item: itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    //Trúng thưởng => được free đơn hàng
    public Media getALuckyItem() {
        Random random = new Random();
        int luckyNumber = random.nextInt(this.itemsOrdered.size());
        itemsOrdered.get(luckyNumber).setCost(0);
        return itemsOrdered.get(luckyNumber);
    }

    //Handling potential Null Pointer Exception
    public void printAnOrder() throws NullPointerException {
        System.out.println("***********************Order***********************");
        MyDate dateOrdered = new MyDate();
        System.out.println();
        System.out.println("Date: " + dateOrdered.getLocalDate());
        System.out.println("Ordered Items:");

        for (Media item: itemsOrdered) {
            if (item instanceof DigitalVideoDisc) {
                DigitalVideoDisc disc = new DigitalVideoDisc((DigitalVideoDisc) item);  //down-casting
            System.out.println("DVD - [" + disc.getTitle() + "] - [" + disc.getCategory() + "] - [" + disc.getDirector() + "] - [" + disc.getLength() + "]: [" + disc.getCost() + " $]");
            } else {
                Book book = new Book((Book) item);                                      //down-casting
                System.out.println("--> Book: [" + book.getTitle() + "]");
                System.out.println(" <+> Category: [" + book.getCategory() + "]");
                System.out.print(" <+> Author(s):");
                
                for (String author: book.getAuthors()) {
                    System.out.print(" [" + author + "]");
                }
                System.out.println();
                System.out.println(" <+> Cost: [" + book.getCost() + " $]");
            }
            System.out.println();
        }
        System.out.println("Total cost: [" + this.totalCost() + " $]");
        System.out.println("***************************************************");
    }
    
}
