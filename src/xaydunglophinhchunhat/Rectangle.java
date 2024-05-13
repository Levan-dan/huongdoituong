package xaydunglophinhchunhat;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }



    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }


    public double showArea(){
        return getHeight() * getWidth();
    }
    public double showPerimeter(){
        return 2 * (getWidth() + getHeight());
    }

    public String showResult(){
        return "Hinh tron co chieu dai " + getHeight() + " va chieu rong " + getWidth() + "\n" +
                "co dien tich la : " + showArea() + "\n" +
                "co chu vi la : " + showPerimeter();
    }
}
