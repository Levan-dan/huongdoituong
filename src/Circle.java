public class Circle {
    private String color;
    private double radius = 1.0;


    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;

    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
       return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
