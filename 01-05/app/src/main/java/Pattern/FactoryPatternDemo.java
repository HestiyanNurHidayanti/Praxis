package Pattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();


        Circle shape1 = (Circle) shapeFactory.getShape("CIRCLE");


        shape1.draw();


        Shape shape2 = shapeFactory.getShape("RECTANGLE");


        shape2.draw();


        Shape shape3 = shapeFactory.getShape("SQUARE");


        shape3.draw();
    }
}


