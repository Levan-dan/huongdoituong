package cacdoituonghinhhoc;

public class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArae() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }


    @Override
    public String toString() {
        return "A Rectangle with width = " + width +" and length = " + height +" , which is a subclass of " + super.toString();
    }
}

