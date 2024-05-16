package lopmophongdenpin;

public class FlashLamp {

    //    attribute
    private boolean status;
    private Battery battery;


    //    constructor
public FlashLamp(){

}
public FlashLamp(boolean status, Battery battery){
    this.status = status;
    this.battery = battery;
}


    //    getter setter
public void setBattery(Battery battery){
    this.battery = battery;
}
public int getBattery(){
    return this.battery.getenergy();
}


//    method
public boolean bat(){
    return this.status = true;
}public boolean tat(){
    return this.status = false;
}


public String batTat(){
    if(this.status){
        return "den dang bat.";
    }else {
       return "dang tat den.";
    }
}



}
