package congtacbongden;

public class Lamp {
    private boolean status;

    public Lamp(){

    }
    public Lamp(boolean status){
        this.status = status;
    }




    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public boolean sang(){
        return this.status = true;
    }


    public boolean toi(){
        return this.status = false;
    }


    public void trangThaiBong(){
        if(this.status){
            System.out.println("Den dang sang roi.");
        }else {
            System.out.println("Den chua duoc mo.");
        }
    }

}
