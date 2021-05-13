package abstruct_interface.comparable;

public class Circle {
    private String color;
    private boolean filled;
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){

    }

    public Circle(String color,boolean filled, double radius) {
        this.color = color;
        this.radius = radius;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
