//Given an array of integers 'a',move all the even integers at the beginning of the array followed by all the odd integers.
//The relative order of odd or even integers does not matter. Return any array that satisfies the condition.

import java.util.Scanner;

public class TwoPointers2 {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortArrayByParity(int[] arr) {
        int n = arr.length;

        int left = 0, right = n-1;

        while(left < right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0) {
                left++;
            }
            if(arr[right] % 2 == 1) {
                right--;
            }
        }
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array size : ");
        System.out.println("Enter " + n + " elements ");
        for(int i=0 ; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        sortArrayByParity(arr);
        System.out.println("Sorted array: ");
        printArray(arr);

    }
}
