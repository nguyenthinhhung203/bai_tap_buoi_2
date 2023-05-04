package oop.b1_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double r){
        radius = r;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
