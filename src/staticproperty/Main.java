package staticproperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("m3", "k3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("d2", "h5");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("d2", "h5");
        System.out.println(Car.numberOfCars);
    }
}
