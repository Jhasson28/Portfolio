package com.example.finalproject.RecyclerView;

public class Term {
    private String items;
    private String itemDescription;
    private int itemPhoto;


    public Term(String items, String itemDescription, int itemPhoto) {
        this.items = items;
        this.itemDescription = itemDescription;
        this.itemPhoto = itemPhoto;
    }

    public String getitems() {
        return items;
    }

    public void setitems(String items) {
        this.items = items;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public int getItemPhoto() {
        return itemPhoto;
    }

    public void setItemPhoto(int itemPhoto) {
        this.itemPhoto = itemPhoto;
    }
}
