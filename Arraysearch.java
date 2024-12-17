package day06classwork;
import java.util.Scanner;

public class Arraysearch {

	public static void main(String[] args) {
		

		
		    
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        int[] array = new int[size];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        System.out.print("Enter the element to search: ");
		        int searchElement = scanner.nextInt();

		        boolean found = false;
		        int position = -1;

		        for (int i = 0; i < size; i++) {
		            if (array[i] == searchElement) {
		                found = true;
		                position = i + 1; // Adjust position to 1-based indexing
		                break;
		            }
		        }

		        if (found) {
		            System.out.println("Element found at position: " + position);
		        } else {
		            System.out.println("Element not found in the array.");
		        }

		        scanner.close();
		    }
		

	}


