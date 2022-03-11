package org.campus02.logisticmanager;

public class Car implements Moveable {
    private String type;
    private String colour;
    private int weight;

    public Car(String type, String colour, int weight) {
        this.type = type;
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(colour + " " + type + " will be moved to " + destination);
    }
}
