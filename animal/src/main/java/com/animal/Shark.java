package com.animal;

public class Shark extends Fish {

    private String color;
    private String size;

    public Shark() {
        this.color = "GREY";
        this.size = "LARGE";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String eat(Fish fish) {
        return "I am eating another fish:" + fish.toString();
    }

    @Override
    public String toString() {
        return "Shark{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
