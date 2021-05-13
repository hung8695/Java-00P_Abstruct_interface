package abstruct_interface.resize;

public class Square extends Shape implements Resizeable {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public void reSize() {
        double percent=((double) Math.random()*(100-1)+1)/100;
        System.out.println(" Square area before : " +getArea());
        System.out.println(" Square area after resize: "+ getArea()*percent);
    }
}
