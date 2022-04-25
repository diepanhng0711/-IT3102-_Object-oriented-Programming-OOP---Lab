
public class Aims {
	public static void main(String args[]) {
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-fi", "Geogre Lucas", 124, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Kohn Musker", 90, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.removeDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan 2nd movie", "Animation", "Aoyama Gosho", 152, 26f);
		anOrder.addDigitalVideoDisc(dvd4);
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		System.out.println(anOrder.getQtyOrdered());
	}
}
