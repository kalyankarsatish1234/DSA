package DSA;
import java.util.Scanner;

public class BucketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asking user to input the size of the array
        System.out.print("Enter the size of array: ");
        int input = sc.nextInt();
        int a[] = new int[input];
        
        // Asking user to input elements into the array
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < input; i++) {
            a[i] = sc.nextInt();
        }
        
        // Calling the bucketSort method to sort the array
        bucketSort(a);
        
        // Printing the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < input; i++) {
            System.out.println(a[i] + " ");
        }
        sc.close();
    }

    // Method to perform Bucket Sort
    static void bucketSort(int[] a) {
        int n = a.length;
        
        // Finding the maximum element in the array
        int max = getMax(a);
        
        // Creating an array to act as buckets, with indices ranging from 0 to the maximum element
        int bucket[] = new int[max + 1];
        
        // Initializing all elements of the bucket array to 0
        for (int i = 0; i <= max; i++){
            bucket[i] = 0;
        }
        
        // Counting the occurrences of each element and storing them in corresponding buckets
        for(int i = 0; i < n; i++){
            bucket[a[i]]++;
        }
        
        // Reconstructing the array by iterating through the buckets
        for(int i = 0, j = 0; i <= max; i++){
            while (bucket[i] > 0) {
                a[j++] = i;
                bucket[i]--;
            }
        }
    }

    // Method to find the maximum element in the array
    static int getMax(int[] a) {
        int n = a.length;
        int max = a[0];
        
        // Looping through the array to find the maximum element
        for (int i = 0; i < n; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
}
/*output: 
 * Enter the size of array: 5
Enter the elements in the array: 
89 78 6798 567 456 
Sorted array: 
78 
89 
456 
567 
6798 
 */