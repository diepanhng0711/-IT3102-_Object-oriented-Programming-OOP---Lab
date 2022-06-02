package hust.soict.hedspi.aims.disc;

import java.math.*;
import java.util.Random;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    public DigitalVideoDisc() {
    	super();
    	this.title = "";
    	this.category = "";
    	this.director = "";
    	this.length = 0;
    	this.cost = 0.0f;
    }

    public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}

	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
		this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(DigitalVideoDisc dvd) {
        super();
		this.title = dvd.title;
        this.category = dvd.category;
        this.director = dvd.director;
        this.length = dvd.length;
        this.cost = dvd.cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void printInfo() {
        System.out.println("----------DVD INFO----------");
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Director: "+ this.director);
        System.out.println("Length: " + this.length);
        System.out.println("Cost: " + this.cost);
    }

    public boolean search(String title) {
        String sTitle[] = title.split(" ");

        String thisTitle[] = this.title.split(" ");

        int count = 0;
        for (String word: sTitle) {
            count++;
        }
        for (int i = 0; i < count; i++) {
            int j = i;
            int check = 0;
            for(String otherWord: sTitle) {
                if(otherWord.equals(sTitle[j++])) check = 1;
                else check = 0;
            }
            if (check == 1) return true;
        }
        return false;
    }

    
}
