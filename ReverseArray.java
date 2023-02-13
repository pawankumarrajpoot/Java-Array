public class ReverseArray { 
    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

    public static void reverse(int arr[]) {
        int i=0,j = arr.length-17                                                                                                                                                                                                           ;
 
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }      

    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2,3,4,5,6,7,8};
        System.out.println("Orginal Array ");
        printArray(arr);
        System.out.println("Reverse Array : ");
        reverse(arr);
        printArray(arr);
    
        
    }
    
}
