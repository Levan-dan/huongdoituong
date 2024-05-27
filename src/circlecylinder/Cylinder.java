package circlecylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double dienTichXungQuanh(){
        return 2 * Math.PI * getRadius() * getHeight();
    }

    public double dienTichDay(){
        return 2 * Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Một hình tròn " + getColor() + " có bán kính = " + getRadius() + " có diện tích = " + getArae() + " có diện tích xung quanh là " + dienTichXungQuanh();

    }
}
