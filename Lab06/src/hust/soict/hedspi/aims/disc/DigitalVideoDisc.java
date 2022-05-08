package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.*;

public class DigitalVideoDisc extends Media {
    //private String title;
    //private String category;
    private String director;
    private int length;
    //private float cost;
    
    public DigitalVideoDisc() {
    	super("","", "", 0.0f);
    	//this.title = "";
    	//this.category = "";
    	this.director = "";
    	this.length = 0;
    	//this.cost = 0.0f;
    }

    public DigitalVideoDisc(String title) {
		super("", title, "", 0.0f);
		//this.title = title;
	}

	public DigitalVideoDisc(String title, String category) {
		super("",title, category, 0.0f);
		//this.title = title;
		//this.category = category;
	}

	public DigitalVideoDisc(String title, String category, String director) {
		super("",title, category, 0.0f);
		//this.title = title;
		//this.category = category;
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super("",title, category, cost);
		//this.title = title;
        //this.category = category;
        this.director = director;
        this.length = length;
        //this.cost = cost;
    }

    public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost);
		//this.title = title;
        //this.category = category;
        this.director = director;
        this.length = length;
        //this.cost = cost;
    }

    public DigitalVideoDisc(DigitalVideoDisc dvd) {
        super(dvd.getId(), dvd.getTitle(), dvd.getCategory(), dvd.getCost());
		//this.title = dvd.title;
        //this.category = dvd.category;
        this.director = dvd.director;
        this.length = dvd.length;
        //this.cost = dvd.cost;
    }

    /*public void setTitle(String title) {
        this.title = title;
    }*/

    /*public void setCategory(String category) {
        this.category = category;
    }*/

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /*public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }*/

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    /*public float getCost() {
        return cost;
    }*/

    public void printInfo() {
        System.out.println("----------DVD INFO----------");
        System.out.println("Title: " + this.getTitle());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Director: "+ this.director);
        System.out.println("Length: " + this.length);
        System.out.println("Cost: " + this.getCost());
    }
}
