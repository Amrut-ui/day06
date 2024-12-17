package day06classwork;
import java.util.Scanner;

public class ArraySqureQubes {

	public static void main(String[] args) {
		
		
		  
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        int[] originalArray = new int[size];
		        int[] squareArray = new int[size];
		        int[] cubeArray = new int[size];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            originalArray[i] = scanner.nextInt();
		            squareArray[i] = originalArray[i] * originalArray[i];
		            cubeArray[i] = originalArray[i] * originalArray[i] * originalArray[i];
		        }

		        System.out.println("Original Array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print(originalArray[i] + " ");
		        }
		        System.out.println();

		        System.out.println("Square Array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print(squareArray[i] + " ");
		        }
		        System.out.println();

		        System.out.println("Cube Array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print(cubeArray[i] + " ");
		        }
		        System.out.println();

		        scanner.close();
		    }
		
	}


