import java.util.Scanner;
class Square {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}
class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(double breadth) {
        this.breadth = breadth;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}
public class squarerectarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Square square = new Square(side);
        double squareArea = square.getArea();
        Rectangle rectangle = new Rectangle(breadth);
        rectangle.setLength(squareArea / breadth);
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Breadth: " + rectangle.getBreadth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        scanner.close();
    }
}