package dieukhuyentivi;

public class Tivi {
    private String moTaKenh;
    private boolean batTat;
    private int amLuong = 100;


    public Tivi(){

    }
    public Tivi(String moTaKenh, boolean batTat){
        this.moTaKenh = moTaKenh;
        this.batTat = batTat;
    }

    public int getAmLuong(){
        return this.amLuong;
    }

    public boolean bat(){
        return this.batTat = true;
    }
    public boolean tat(){
        return this.batTat = false;
    }
    public int giamAmLuong(){
        return this.amLuong--;
    }
    public int tangAmLuong(){
        return this.amLuong++;
    }
    public String chuDe(){
        return " Ban dang o kenh todetivi";
    }
    public String amLuongHienTai(){
        return "Am luong luc nay la: " + getAmLuong();
    }

}
