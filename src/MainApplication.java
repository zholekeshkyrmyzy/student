import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Cylinder> cylinders = new ArrayList<>();
        System.out.println();
        circles.add(new Circle(5.0));
        circles.add(new Circle(3.2));
        circles.add(new Circle(7.5));

        cylinders.add(new Cylinder(4.0, 10.0));
        cylinders.add(new Cylinder(2.5, 5.0));

        System.out.println("\n Circle Calculations");
        for (Circle circle : circles) {
            System.out.println(circle);
            System.out.printf("Circumference: %.2f\n", circle.circumference());
            System.out.printf("Area: %.2f\n\n", circle.area());
        }

        System.out.println("\n Cylinder Calculations");
        for (Cylinder cylinder : cylinders) {
            System.out.println(cylinder);
            System.out.printf("Surface Area: %.2f\n", cylinder.surfaceArea());
            System.out.printf("Volume: %.2f\n\n", cylinder.volume());
        }
    }
}
