package com.electronicrecycle.ecycle.models;

public class ListItems
{
    private String title;
    private int id;
    public String getName() {
        return title;
    }
    public void setName(String name) {
        this.title = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
