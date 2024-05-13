package phuongtrinhbac2;

public class PhuongTrinh {
    private double a;
    private double b;
    private double c;


    public PhuongTrinh() {

    }

    public PhuongTrinh(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double delta() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public String phuongTrinh(){
        return "(" +this.a + ")X2 + " + "(" + this.b + ")X + " + this.c;
    }
    public String twoDistinctSolutions() {
        return "X1 = " + ((-this.b + Math.sqrt(delta())) / (2 * this.a)) + "\n" +
                "X2 = " + ((-this.b - Math.sqrt(delta())) / (2 * this.a));

    }

    public String aSingleSolution() {
        return "X1 = X2 = " + (-this.b / (2 * this.a));
    }

    public String noSolution() {
        return "No Solution.";
    }


}
