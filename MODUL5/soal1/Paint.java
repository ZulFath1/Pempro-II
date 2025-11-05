package soal1;

public class Paint {
    private double coverage;

    public Paint(double c) {
        this.coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Menghitung cat untuk: " + s.toString());
        return s.area() / coverage;
    }
}