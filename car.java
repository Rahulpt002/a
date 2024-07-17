import java.util.Scanner;
class VEHICLE {
    private String manufacture;
    private String color;
    private int year;
    private String model;
    public VEHICLE(String manufacture, String color, int year, String model) {
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
        this.model = model;
    }
    public String getManufacture() {
        return manufacture;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
}
class CAR extends VEHICLE {
    private String bodyStyle;

    public CAR(String manufacture, String color, int year, String model, String bodyStyle) {
        super(manufacture, color, year, model);
        this.bodyStyle = bodyStyle;
    }
    public String getBodyStyle() {
        return bodyStyle;
    }
    public void display() {
        System.out.println("Manufacturer: " + getManufacture());
        System.out.println("Color: " + getColor());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + getModel());
        System.out.println("Body Style: " + getBodyStyle());
        System.out.println("---------------------------");
    }
}
public class car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        CAR[] cars = new CAR[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car " + (i + 1));
            System.out.print("Manufacture: ");
            String manufacture = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Body Style: ");
            String bodyStyle = scanner.nextLine();
            cars[i] = new CAR(manufacture, color, year, model, bodyStyle);
        }
        System.out.println("\nDetails of Cars:");
        for (CAR car : cars) {
            car.display();
        }
        scanner.close();
    }
}