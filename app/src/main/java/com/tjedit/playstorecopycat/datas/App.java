package com.tjedit.playstorecopycat.datas;

import java.io.Serializable;

public class App implements Serializable {
    public  int rank;
    public String title;
    public  String companyName;
    public int userRating;
    public int price;
    public boolean isMine;

    public App(int rank, String title, String companyName, int userRaing, int price, boolean isMine) {
        this.rank = rank;
        this.title = title;
        this.companyName = companyName;
        this.userRating = userRaing;
        this.price = price;
        this.isMine = isMine;
    }
}
