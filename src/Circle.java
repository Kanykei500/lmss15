import javax.swing.plaf.metal.MetalIconFactory;

public class Circle {
    private final double PI = Math.PI;
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public static double area(double radius){
        final double PI = Math.PI;
        return PI * (radius * radius);
    }
    public static double circumference(double radius){
        final double PI = Math.PI;
        return PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}