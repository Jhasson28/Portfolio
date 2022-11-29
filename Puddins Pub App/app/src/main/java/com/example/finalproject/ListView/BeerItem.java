package com.example.finalproject.ListView;

public class BeerItem {
    private String name;
    private String description;

    public BeerItem(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String toString() {
        return getName();
    }

}
