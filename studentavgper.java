import java.util.Scanner;
class Student {
    private int studentID;
    private String name;
    private String branch;
    private int year;
    private String location;
    private String college;
    private double[] marks = new double[6];
    public Student(int studentID, String name, String branch, int year, String location, String college) {
        this.studentID = studentID;
        this.name = name;
        this.branch = branch;
        this.year = year;
        this.location = location;
        this.college = college;
    }
    public void setMarks(double[] marks) {
        if (marks.length == 6) {
            this.marks = marks;
        } else {
            System.out.println("Please provide marks for all 6 subjects.");
        }
    }
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    public double calculatePercentage() {
        double totalMarks = calculateAverage() * marks.length;
        return (totalMarks / (100 * marks.length)) * 100;
    }
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("Location: " + location);
        System.out.println("College: " + college);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter College: ");
        String college = scanner.nextLine();
        Student student = new Student(studentID, name, branch, year, location, college);
        double[] marks = new double[6];
        System.out.println("Enter Marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        student.setMarks(marks);
        student.displayDetails();
        scanner.close();
    }
}