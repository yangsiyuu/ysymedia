package com.example.myapplication.bean;

public class albums_entity {
    private int img;
    private String img_text;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getImg_text() {
        return img_text;
    }

    public void setImg_text(String img_text) {
        this.img_text = img_text;
    }
    public albums_entity(int n_img,String n_img_text){
        this.img=n_img;
        this.img_text=n_img_text;

    }
}
