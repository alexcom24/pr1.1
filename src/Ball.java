import java.lang.*;
public class Ball {
    private double radius;
    private String color;
    public Ball(double radius,String color) {
        this.radius=radius;
        this.color=color;
    }
    public Ball(double radius) {
        this.radius=radius;
        color="uncolored";
    }
    public Ball() {
        radius=1.0;
        color="uncolored";
    }
    public double Obyem() {
        return (4*Math.PI*radius*radius*radius)/3;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public String toString() {
        return this.color+", radius "+this.radius;
    }
}
