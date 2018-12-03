package com.animal;

public class Clownfish extends Fish {

    private String color;
    private String size;

    public Clownfish() {
        this.color = "ORANGE";
        this.size = "SMALL";
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

    public String makeJokes() {
        return "Knock Knock...";
    }

    @Override
    public String toString() {
        return "Clownfish{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
