import java.util.Scanner;
public class Sequential {
 public static void main(String[] args) {
 int[] exampleset = {2, 9, 6, 7, 4, 5, 3, 0, 1, 10};
 Scanner scn = new Scanner(System.in);
 System.out.println("Enter your target integer in the array:");
 int target = scn.nextInt();
 scn.close(); // Close the scanner to prevent resource leaks
 sequentialSearch(exampleset, target);
 }
 public static void sequentialSearch(int[] array, int target) {
 for (int i = 0; i < array.length; i++) {
 if (array[i] == target) {
 System.out.println("Your target integer is at index " + i + " of the array");
 return;
 }
 }
 System.out.println("Your target integer does not exist in the array");
 }
}