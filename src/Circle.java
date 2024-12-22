public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
    @Override
public String toString() {
        return "Circle with radius " + radius + " and area " + area();
}
}
