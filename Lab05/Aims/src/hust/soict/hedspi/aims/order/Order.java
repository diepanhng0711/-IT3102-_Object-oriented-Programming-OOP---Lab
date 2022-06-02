package hust.soict.hedspi.aims.order;
import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.utils.*;

import java.util.ArrayList;
import java.math.*;
import java.util.Random;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;

    public static final int MAX_LIMITED_ORDERS = 5;
    
    private static int nbOrders = 0;
	
	private int qtyOrdered = 0;
	
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];


    public Order() {
        if (nbOrders >= 5) {
            System.out.println("Full of orders! Cannot add any other order!");
            return ;
        }
        nbOrders++;
    }

    public int getNumberOfOrders() {
        return nbOrders;
    }
    
    public int getQtyOrdered () {
    	return this.qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println(disc.getTitle() + " has been added!");
        } else {
            System.out.println("The order is already full!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        int count = 0;

        for (DigitalVideoDisc disc: dvdList)  count++;
        if ((count + this.qtyOrdered) > MAX_NUMBER_ORDERED) {
            System.out.println("Cannot add this DVD list to the order because of overcoming the order's limitation!");
            return ;
        }
        for(DigitalVideoDisc disc: dvdList) {
            itemsOrdered[qtyOrdered++] = disc;
        }
        System.out.println("The DVD List has been added successfully!");
    }

    public void addDigitalVideoDisc(ArrayList<DigitalVideoDisc> dvdList){
        int count = 0;

        for (DigitalVideoDisc disc: dvdList)  count++;
        if ((count + this.qtyOrdered) > MAX_NUMBER_ORDERED) {
            System.out.println("Cannot add this DVD list to the order because of overcoming the order's limitation!");
            return ;
        }
        for(DigitalVideoDisc disc: dvdList) {
            itemsOrdered[qtyOrdered++] = disc;
        }
        System.out.println("The DVD List has been added successfully!");
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if ((qtyOrdered + 2) > MAX_NUMBER_ORDERED) {
            System.out.println("Cannot add " + dvd1.getTitle() + " and " + dvd2.getTitle() + " to the order because of overcoming the order's limitation!");
            return ;
        }
        itemsOrdered[qtyOrdered++] = dvd1;
        itemsOrdered[qtyOrdered++] = dvd2;
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

    public DigitalVideoDisc getALuckyItem() {
        Random rd = new Random();
        int luckynumber = rd.nextInt(this.qtyOrdered);
        this.itemsOrdered[luckynumber].setCost(0);
        return this.itemsOrdered[luckynumber];
    }

    public void printAnOrder() throws NullPointerException {
        System.out.println("***********************Order***********************");
        MyDate dateOrdered = new MyDate();
        System.out.println();
        System.out.println("Date: " + dateOrdered.getLocalDate());
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("DVD - [" + itemsOrdered[i].getTitle() + "] - [" + itemsOrdered[i].getCategory() + "] - [" + itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: [" + itemsOrdered[i].getCost() + " $]");
        }
        System.out.println("Total cost: [" + this.totalCost() + " $]");
        System.out.println("***************************************************");
    }
}
