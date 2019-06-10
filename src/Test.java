public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =  new Circle(2.1);
        shapes[1] =  new Rectangle(3.5, 2.1);
        shapes[2] =  new square(1.2);
        Circle circle = (Circle) shapes[0];
        Rectangle rectangle = (Rectangle) shapes[1];
        square square = (square) shapes[2];

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof square) {
                square.howtocolor();
            } else {
                System.out.println(circle.getArea());
                System.out.println(rectangle.getArea());
            }
        }
    }
}

