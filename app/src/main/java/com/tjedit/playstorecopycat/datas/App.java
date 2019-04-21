package com.tjedit.playstorecopycat.datas;

public class App {
    public  int rank;
    public String title;
    public  String companyName;
    public int userRaing;
    public int price;
    public boolean isMine;

    public App(int rank, String title, String companyName, int userRaing, int price, boolean isMine) {
        this.rank = rank;
        this.title = title;
        this.companyName = companyName;
        this.userRaing = userRaing;
        this.price = price;
        this.isMine = isMine;
    }
}
