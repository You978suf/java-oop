interface shape {
    double getArea();

}
    class Circle implements shape{
        double radius;

        Circle(double r) {
            radius = r;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }






    class Square implements shape{
        double si;

        Square(double s) {
            si = s;
        }

        public double getArea() {
            return si * si;
        }
    }

public class task5{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}
