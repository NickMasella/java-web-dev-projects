package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    MenuItem app = new MenuItem(7.99, "Toasted Ravioli", "appetizer", false);
    MenuItem entree = new MenuItem(11.99, "Hamburger", "Entree", false);
    MenuItem dessert = new MenuItem(1.99, "Snickers Bar", "dessert", true);

    ArrayList<MenuItem> menu = new ArrayList<>(); {
        menu.add(app);
        menu.add(entree);
        menu.add(dessert);
    }
    Date today = new Date();
    Menu restaurantMenu = new Menu(today , menu);

    public static void main(String[] args) {
        System.out.println(toString(restaurantMenu));
    }
}
