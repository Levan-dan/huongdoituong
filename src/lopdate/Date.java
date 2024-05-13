package lopdate;

public class Date {
    private int day;
    private int month;
    private int years;


    public Date(){

    }
    public Date(int day, int month, int years){
        this.day = day;
        this.month = month;
        this.years = years;
    }


    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYears(){
        return this.years;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYears(int years){
        this.years = years;
    }


    public void show(){
        System.out.println("Ngay thang nam ban muon hien thi la: " + getDay() + "/" + getMonth() + "/" + getYears());
    }
}
