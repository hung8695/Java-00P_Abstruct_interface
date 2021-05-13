package abstruct_interface.resize;

public class Retangle extends Shape implements Resizeable {
    private int width;
    private int height;

    public Retangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Retangle(){

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public void reSize() {
        double percent=((double) Math.random()*(100-1)+1)/100;
        System.out.println(" Retangle area before : " +getArea());
        System.out.println("Retangle area after resize: "+ getArea()*percent);
    }
}
