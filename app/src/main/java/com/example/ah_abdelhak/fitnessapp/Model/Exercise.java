package com.example.ah_abdelhak.fitnessapp.Model;

/**
 * Created by ah_abdelhak on 9/29/2017.
 */
public class Exercise {

    private int img_id ;
    private String name ;

    public Exercise(int img_id, String name) {
        this.img_id = img_id;
        this.name = name;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
