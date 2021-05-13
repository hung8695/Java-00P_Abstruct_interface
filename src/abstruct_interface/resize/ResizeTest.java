package abstruct_interface.resize;

public class ResizeTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Retangle(30,50);
        shapes[1]=new Circle(20);
        shapes[2]=new Square(50);

        for(Shape shape:shapes){
            if(shape instanceof Retangle){
                Resizeable resizeable = (Retangle) shape;
                resizeable.reSize();
            }
            if(shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.reSize();
        }
            if(shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.reSize();

        }

        }
    }
}
