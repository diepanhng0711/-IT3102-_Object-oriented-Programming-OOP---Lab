package hust.soict.hedspi.aims;

import java.util.ArrayList;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String args[]) {
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-fi", "Geogre Lucas", 124, 24.95f);
		anOrder.addDigitalVideoDisc(dvd1, dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Kohn Musker", 90, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan 2nd movie", "Animation", "Aoyama Gosho", 152, 26f);
		anOrder.addDigitalVideoDisc(dvd4);

		DigitalVideoDisc[] dvdList1 = new DigitalVideoDisc[2];
		dvdList1[0] = new DigitalVideoDisc("Hana Yori Dango", "Animation", "Yoko Kamio", 140, 22f);
		dvdList1[1] = new DigitalVideoDisc("Captain America: The Winter Soldier", "Action", "Anthony Russo", 136, 35f);
		anOrder.addDigitalVideoDisc(dvdList1);
		//anOrder.removeDigitalVideoDisc(dvdList1[0]);

		Order anOrder2 = new Order();

		ArrayList<DigitalVideoDisc> dvdList2 = new ArrayList<DigitalVideoDisc>();
		dvdList2.add(new DigitalVideoDisc("Produce 101 Season 2 Ep.11", "Korean TV show", "Kim Yong-bum", 250, 12f));
		dvdList2.add(new DigitalVideoDisc("Ai la Trieu Phu", "Vietnamese TV Show", "Lai Van Sam", 60, 0f));
		anOrder2.addDigitalVideoDisc(dvdList2);
		//anOrder.removeDigitalVideoDisc(dvdList2.get(0));

		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println("The number of discs in the first order is " + anOrder.getQtyOrdered());
        System.out.println("The number of discs in the first second is " + anOrder2.getQtyOrdered());
		System.out.println("The number of orders = " + anOrder.getNumberOfOrders());

		System.out.println("***************************************************");
		System.out.println();
		anOrder.printAnOrder();
        System.out.println();

        DigitalVideoDisc luckyItem = anOrder.getALuckyItem();

        if (luckyItem != null) {
            System.out.println("The lucky item is: " + luckyItem.getTitle());
            System.out.println("The cost of the lucky item now is: " + luckyItem.getCost());
        } else {
            System.out.println("There is no lucky item!");
        }
        System.out.println();
        
        System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println("The number of discs in the first order is " + anOrder.getQtyOrdered());
        System.out.println("The number of discs in the first second is " + anOrder2.getQtyOrdered());
		System.out.println("The number of orders = " + anOrder.getNumberOfOrders());

        System.out.println("***************************************************");
		System.out.println();
		anOrder.printAnOrder();
	}
}
