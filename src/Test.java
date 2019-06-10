public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =  new Circle(2.1);
        shapes[1] =  new Rectangle(3.5, 2.1);
        shapes[2] =  new square(1.2);

        for (Shape shape :shapes){

            if (shape instanceof square){
                ((square) shape).howtocolor();
            }
            else {
                System.out.println(shape.getArea());
            }
        }
    }
}

