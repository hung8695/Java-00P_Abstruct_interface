package abstruct_interface.resize;

public class Circle extends Shape implements Resizeable {
    private int radius;
    public Circle(){

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void reSize() {
        double percent=((double) Math.random()*(100-1)+1)/100;
        System.out.println("Circle area before : " +getArea());
        System.out.println("Circle after resize: "+ getArea()*percent);
    }
}
