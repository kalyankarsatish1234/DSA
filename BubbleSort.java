package DSA;

import java.util.Scanner;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asking the user to input the size of the array
        
        System.out.print("Enter the size of array: ");
        int input = sc.nextInt();
        int a[] = new int[input];
        
        // Asking the user to input elements into the array
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < input; i++) {
            a[i] = sc.nextInt();
        }
        
        // Calling the bubbleSort method to sort the array
        bubbleSort(a);
        
        // Printing the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < input; i++) {
            System.out.println(a[i] + " ");
        }
        
        // Closing the scanner to prevent resource leak
        sc.close();
    }

    // Function to perform Bubble Sort
    static void bubbleSort(int[] a) {
        int n = a.length;
        int i, j, temp;
        
        // Iterating through the array
        for (i = 0; i < a.length; i++) {
            // Comparing adjacent elements and swapping if they are in the wrong order
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
