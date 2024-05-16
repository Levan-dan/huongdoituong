package adamvaeva;

public class Human {

    private String name;
    private String gender;
    private double weight;

    private boolean eat;


    public Human() {

    }

    public Human(String name, String gender, double weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public boolean isEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public void tangCan() {
        System.out.println(++this.weight + " kg");
    }

    public String resultNam() {
        return "Name : " + getName() + " / Gioi tinh : " + getGender();
    }

    public String resultNu() {
        return "Name : " + getName() + " / Gioi tinh : " + getGender();
    }

    public boolean an() {
        return this.eat = true;
    }
}