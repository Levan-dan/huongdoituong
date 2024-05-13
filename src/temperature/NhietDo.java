package temperature;

public class NhietDo {
    public double doC;

    public NhietDo(){

    }
    public NhietDo(double doC){
        this.doC = doC;
    }


    public double getDoC(){
        return this.doC;
    }
    public void setDoC(double doC){
        this.doC = doC;
    }



    public double showDoF(){
        return (this.doC * 9/5) + 32;
    }
    public double showKenvin(){
        return this.doC + 273.15;
    }
    public void show(){
        System.out.println(this.doC + " do C bang " + showDoF() + " do F va bang " + showKenvin() + " Kevin.");
    }
}
