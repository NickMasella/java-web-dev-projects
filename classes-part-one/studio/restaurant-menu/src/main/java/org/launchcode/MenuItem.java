package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    public MenuItem(double price, String description, String category, boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    public void setPrice(double aPrice){
        price = aPrice;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }
}
