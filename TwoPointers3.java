
import java.util.Scanner;

//Given an integer array 'a' sorted in non-decreasing order, return an array of the squares 
//of each number sorted in non-decreasing order.

public class TwoPointers3 {
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

   public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
   }

   public static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left =0, right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array size: ");
        System.out.println("Enter "+ n + " elements ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Sorted Array: ");
        reverse(ans);
        printArray(ans);
    }
}

