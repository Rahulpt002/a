import java.util.Scanner;
interface Shape {
double calculateArea();
}
class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}
}
class Rectangle implements Shape {
private double length;
private double width;
public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
@Override
public double calculateArea() {
return length * width;
}
}
public class Main6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter radius of the circle: ");
double radius = scanner.nextDouble();
Circle circle = new Circle(radius);
double circleArea = circle.calculateArea();
System.out.println("Area of the circle: " + circleArea);
System.out.print("\nEnter length of the rectangle: ");
double length = scanner.nextDouble();
System.out.print("Enter width of the rectangle: ");
double width = scanner.nextDouble();
Rectangle rectangle = new Rectangle(length, width);
double rectangleArea = rectangle.calculateArea();
System.out.println("Area of the rectangle: " + rectangleArea);
scanner.close();
}
}
