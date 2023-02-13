// import java.util.*;
public class Search_InRotate_Sorted { 
    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[],int i,int j) {
        // i = 0;
        // j = arr.length-1;
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateArray(int arr[],int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 5;
        System.out.println("Array before rotating ");
        printArray(arr);
        // reverse(arr, 0, arr.length-1);
        // printArray(arr);

        
        System.out.println("Array after rotating ");
        rotateArray(arr, k);
        printArray(arr);

    }
    
}
