package lophinhtron;

public class Circle {
    private double radius;
    private String color;


    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String show() {
        return "Hinh tron co mau " + this.color + " va ban kinh bang " + getRadius() + " co dien tich la: " + getArea();
    }

}
