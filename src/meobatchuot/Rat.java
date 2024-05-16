package meobatchuot;

public class Rat {
    private String name;
    private double weight;
    private int speed;
    private boolean liveDie;


    public Rat() {
    }

    public Rat(String name, double weight, int speed, boolean liveDie) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.liveDie = liveDie;
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
    public boolean isLiveDie(){
        return this.liveDie;
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
    public void setLiveDie(boolean liveDie){
        this.liveDie = liveDie;
    }


    public boolean song(){
        return this.liveDie = true;
    }
    public boolean chet(){
        return this.liveDie = false;
    }

    public String khocThet(){
        return "hu hu hu hu";
    }
}
