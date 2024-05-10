package DSA;
import java.util.Scanner;

/**
 * BubleSort
 */
public class BubleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int input = sc.nextInt();
        int a[] = new int[input];
        System.out.println("Enter the elment in array: ");
        for (int i = 0; i < input; i++) {
            a[i] = sc.nextInt();
        }
        bubleSort(a);
        System.out.println("Sorted array: ");
        for (int i = 0; i < input; i++) {
            System.out.println(a[i] + " ");
        }

    }
//function to sort array
    static void bubleSort(int[] a) {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < a.length; i++) {
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


