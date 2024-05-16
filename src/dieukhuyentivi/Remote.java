package dieukhuyentivi;

public class Remote {

    private int code;


    public Remote(){

    }
    public Remote(int code){
        this.code = code;
    }


    public int getCode(){
        return this.code;
    }
    public void setCode(int code){
        this.code = code;
    }

    public String chuyenKenh(int kenh){
        return "Tivi dang o kenh : " + kenh;
    }



}
