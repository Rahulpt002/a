import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int[] marks = new int[7];
    int totalMarks;
    double percentage;
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.totalMarks = calculateTotalMarks();
        this.percentage = calculatePercentage();
    }
    private int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    private double calculatePercentage() {
        return (totalMarks / 7.0);
    }
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
class Mooc extends Student {
    String course;
    public Mooc(int rollNo, String name, int[] marks, String course) {
        super(rollNo, name, marks);
        this.course = course;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}
class Course extends Mooc {
    String courseName;
    public Course(int rollNo, String name, int[] marks, String course, String courseName) {
        super(rollNo, name, marks, course);
        this.courseName = courseName;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Course Name: " + courseName);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        int[] marks = new int[7];
        System.out.println("Enter Marks for 7 subjects:");
        for (int i = 0; i < 7; i++) {
            marks[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        Course studentCourse = new Course(rollNo, name, marks, course, courseName);
        System.out.println("\nStudent Details:");
        studentCourse.display();
        scanner.close();
    }
}