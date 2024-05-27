package circlecylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder(5.5, "xanh", 6.6);
        System.out.println(cylinder.toString());
    }
}
