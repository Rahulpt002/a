import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

   
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the side of the square: ");
        double sideOfSquare = scanner.nextDouble();

   
        double areaOfSquare = sideOfSquare * sideOfSquare;

       
        System.out.print("Enter the breadth of the rectangle: ");
        double breadthOfRectangle = scanner.nextDouble();

      
        double lengthOfRectangle = areaOfSquare / breadthOfRectangle;

     
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(lengthOfRectangle);
        rectangle.setBreadth(breadthOfRectangle);

  
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());

        
    }
}
