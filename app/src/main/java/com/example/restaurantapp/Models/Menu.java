package com.example.restaurantapp.Models;

import java.util.Hashtable;

public class Menu {
    private Hashtable<Integer, String> menu;

    public Menu(){}
    public Menu(Hashtable<Integer, String> menu) {
        this.menu = menu;
    }

    public Hashtable<Integer, String> getMenu() {
        return menu;
    }

    public void setMenu(Hashtable<Integer, String> menu) {
        this.menu = menu;
    }
}
