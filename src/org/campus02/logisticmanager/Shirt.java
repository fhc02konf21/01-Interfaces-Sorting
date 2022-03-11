package org.campus02.logisticmanager;

public class Shirt implements Moveable {
    private String brand;
    private String size;
    private String colour;

    public Shirt(String brand, String size, String colour) {
        this.brand = brand;
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void move(String destination) {
        System.out.println(colour + " " + brand + " will be moved to " + destination);
    }
}
