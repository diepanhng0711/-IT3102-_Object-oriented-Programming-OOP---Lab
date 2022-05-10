package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.disc.*;

public abstract class Media {
    private String id;
    private String title;
    private String category;
    private float cost;

    public Media(String id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    public String getTitle() {
        return this.title;
    }

    /*public void setTitle(String title) {
        this.title = title;
    }*/

    public String getCategory() {
        return this.category;
    }

    /*public void setCategory(String category) {
        this.category = category;
    }*/

    public float getCost() {
        return this.cost;
    }

    /*public void setCost(float cost) {
        this.cost = cost;
    }*/

    public String getId() {
        return this.id;
    }

    /*public void setId(String id) {
        this.id = id;
    }*/

}
