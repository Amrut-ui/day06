package day06classwork;
import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
		

		
		  
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the arrays: ");
		        int size = scanner.nextInt();

		        int[] array1 = new int[size];
		        int[] array2 = new int[size];
		        int[] sumArray = new int[size];

		        System.out.println("Enter the elements of the first array:");
		        for (int i = 0; i < size; i++) {
		            array1[i] = scanner.nextInt();
		        }

		        System.out.println("Enter the elements of the second array:");
		        for (int i = 0; i < size; i++) {
		            array2[i] = scanner.nextInt();
		        }

		        // Add corresponding elements of the two arrays and store in the sum array
		        for (int i = 0; i < size; i++) {
		            sumArray[i] = array1[i] + array2[i];
		        }

		        System.out.println("Sum array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print(sumArray[i] + " ");
		        }
		        System.out.println();

		        scanner.close();
		    }
		

	}


