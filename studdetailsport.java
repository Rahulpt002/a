import java.util.*;
interface Student {
void displayDetails();
}
interface Sport {
void displaySport();
}
class StudentSport implements Student, Sport {
private String name;
private int age;
private String sport;
public StudentSport(String name, int age, String sport) {
this.name = name;
this.age = age;
this.sport = sport;
}
@Override
public void displayDetails() {
System.out.println("Student Details:");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
@Override
public void displaySport() {
System.out.println("Sport Details:");
System.out.println("Sport: " + sport);
}
}
public class Main5 {
public static void main(String[] args) {
StudentSport student = new StudentSport("John Doe", 20, "Football");
student.displayDetails();
student.displaySport();
String[] names = {"John", "Alice", "Bob", "Eve", "Charlie"};
System.out.println("\nOriginal String Array: " + Arrays.toString(names));
Arrays.sort(names);
System.out.println("Sorted String Array: " + Arrays.toString(names));
int[] numbers = {34, 12, 89, 45, 67};
System.out.println("\nOriginal Integer Array: " + Arrays.toString(numbers));
Arrays.sort(numbers);
System.out.println("Sorted Integer Array: " + Arrays.toString(numbers));
int largest = numbers[numbers.length - 1];
System.out.println("Largest element: " + largest);
String str1 = "Hello";
String str2 = "World";
System.out.println("\nBefore Swap: str1 = " + str1 + ", str2 = " + str2);
String temp = str1;
str1 = str2;
str2 = temp;
System.out.println("After Swap: str1 = " + str1 + ", str2 = " + str2);
String lowercase = "hello";
String uppercase = lowercase.toUpperCase();
System.out.println("Lowercase: " + lowercase);
System.out.println("Uppercase: " + uppercase);
}
}
