import java.util.Arrays;
import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("\nOriginal String: " + input);
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
        int length = input.length();
        System.out.println("Length: " + length);
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Sorted String: " + sortedString);
        scanner.close();
    }
}
