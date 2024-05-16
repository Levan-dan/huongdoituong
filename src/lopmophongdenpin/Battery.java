package lopmophongdenpin;

public class Battery {

//    attribute
    private int energy;


//    constructor
    public Battery(){

    }
    public Battery(int energy){
        this.energy = energy;
    }


//    getter setter
    public int getenergy(){
        return this.energy;
    }



//    method
    public void phanTramPin(){
        if(this.energy > 0){
            this.energy--;
        }
    }

}
