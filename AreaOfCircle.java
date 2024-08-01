import java.util.function.Function;
public class AreaOfCircle {
    public static void main(String[] args) {
        Function<Double, Double> calculateArea = radius -> Math.PI * radius * radius;
        double radius = 7.0;
        double area = calculateArea.apply(radius);

        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}