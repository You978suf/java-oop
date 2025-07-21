class Rectangle{
    double length;
    double width;

    Rectangle(double len, double wid){
        this.length=len;
        this.width=wid;

    }

    double calculateArea(){
        return length*width;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0,5.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}