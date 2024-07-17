import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] array = new int[10];
System.out.println("Enter 10 integers:");
for (int i = 0; i < 10; i++) {
array[i] = scanner.nextInt();
}
int choice;
do {
System.out.println("\nMenu:");
System.out.println("1. Display elements");
System.out.println("2. Sort elements");
System.out.println("3. Sum of elements");
System.out.println("4. Maximum element");
System.out.println("5. Minimum element");
System.out.println("6. Search for an element");
System.out.println("7. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
switch (choice) {
case 1:
displayElements(array);
break;
case 2:
sortElements(array);
break;
case 3:
int sum = sumElements(array);
System.out.println("Sum of elements: " + sum);
break;
case 4:
int max = findMax(array);
System.out.println("Maximum element: " + max);
break;
case 5:
int min = findMin(array);
System.out.println("Minimum element: " + min);
break;
case 6:
System.out.print("Enter element to search: ");
int key = scanner.nextInt();
int index = findElement(array, key);
if (index != -1) {
System.out.println("Element found at index: " + index);
} else {
System.out.println("Element not found.");
}
break;
case 7:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice! Please enter a number between 1 and 7.");
}
} while (choice != 7);
scanner.close();
}
public static void displayElements(int[] array) {
System.out.println("Elements of the array:");
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
public static void sortElements(int[] array) {
Arrays.sort(array);
System.out.println("Sorted array:");
displayElements(array);
}
public static int sumElements(int[] array) {
int sum = 0;
for (int num : array) {
sum += num;
}
return sum;
}
public static int findMax(int[] array) {
int max = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
}
return max;
}
public static int findMin(int[] array) {
int min = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] < min) {
min = array[i];
}
}
return min;
}
public static int findElement(int[] array, int key) {
for (int i = 0; i < array.length; i++) {
if (array[i] == key) {
return i;
}
}
return -1;
}
}