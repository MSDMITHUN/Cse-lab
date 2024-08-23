import java.util.Scanner;
public class Binary {
 public static void main(String[] args) {
 int[] exampleset = {1, 11, 24, 34, 67, 89, 102}; 
 System.out.print("Enter your target integer in the array: "); 
 Scanner scn = new Scanner(System.in);
 int target = scn.nextInt();
 binarySearch(exampleset, target);
 }
 public static void binarySearch(int[] array, int target) {
 int lowEnd = 0;
 int highEnd = array.length - 1; 
 
 while (highEnd >= lowEnd) {
 int middle = (lowEnd + highEnd) / 2; 
 
 if (array[middle] == target) {
 System.out.println("Your target integer is at index " + middle + " of the array");
 return;
 } else if(array[middle] < target) {
 lowEnd = middle + 1;
 } else {
 highEnd = middle - 1;
 }
 }
 
 System.out.println("Your target integer does not exist in the array");
 }
}