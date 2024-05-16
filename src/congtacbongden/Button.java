package congtacbongden;

import lopmophongdenpin.Battery;

public class Button {
    private boolean status;
    private Lamp lamp;


    public Button(){
    }
    public Button(boolean status, Lamp lamp){
        this.lamp = lamp;
        this.status = status;
    }


    public void bongSang(){
        System.out.println("Bong da duoc bat.");
    }
    public void bongKhongSang(){
        System.out.println("Bong da duoc tat.");
    }
}
