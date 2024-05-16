package meobatchuot;

public class Cat {
    private String name;
    private double weight;
    private int speed;


    public Cat(){

    }
    public Cat(String name, double weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }


    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }


    public String hoHet(){
        return "meo méo meo mèo meo.";
    }


}
