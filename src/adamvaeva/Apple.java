package adamvaeva;

public class Apple {

    private double weight;

    public Apple() {
        this.weight = 10.0; // Khối lượng mặc định là 10 đơn vị
    }

    public double getWeight() {
        return this.weight;
    }

    public void decrease() {
        if (this.weight > 0) {
            this.weight--;
        }
        System.out.println("Con " + this.weight + " mieng tao.");

    }
}

