package com.example.foodorder;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

public class module {
    public module(String foodname, String decrpt, int foodimage) {
        this.foodname = foodname;
        this.decrpt = decrpt;
        this.foodimage = foodimage;
    }

    String foodname, decrpt, viewlist;
    int foodimage;




    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getDecrpt() {
        return decrpt;
    }

    public void setDecrpt(String decrpt) {
        this.decrpt = decrpt;
    }

    public String getViewlist() {
        return viewlist;
    }

    public void setViewlist(String viewlist) {
        this.viewlist = viewlist;
    }

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }
}