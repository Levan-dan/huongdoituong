package lophinhchunhat;

public class HinhChuNhat {
    private double width;
    private double height;
    private String color;


    public HinhChuNhat() {

    }

    public HinhChuNhat(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public void show() {
        System.out.println("Hinh chu nhat mau " + getColor() + " co dien tich la: " + getArea());
    }
}
