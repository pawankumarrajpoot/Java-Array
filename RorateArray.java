public class RorateArray { 
    public static int [] rotate(int arr[],int k) {
        int n = arr.length;
        int j = 0;
        k = k%n;
        int ans[] = new int [n];
        for(int i=n-k;i<n;i++) {
            ans[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++) {
            ans[j++] = arr[i];
        }
        System.out.println(k);
        return ans;

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
        System.out.println("Original Array : ");
        printArray(arr);
        System.out.println("After rotating Array: ");
        int ans[] = rotate(arr, k);
        rotate(arr, k);
        printArray(ans);


    }
    
}
