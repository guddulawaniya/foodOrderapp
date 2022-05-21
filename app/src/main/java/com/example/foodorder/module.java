package com.example.foodorder;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

public class module {


    String foodname,decrpt;
    int foodimage;

    public module(String foodname, String decrpt, int foodimage) {
        this.foodname = foodname;
        this.decrpt = decrpt;
        this.foodimage = foodimage;
    }


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

    public int getFoodimage() {
        return foodimage;
    }

    public void setFoodimage(int foodimage) {
        this.foodimage = foodimage;
    }
}
