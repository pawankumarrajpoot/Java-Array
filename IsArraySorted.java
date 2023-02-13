public class IsArraySorted { 
    public static boolean printArray(int arr[]) { 
        boolean check = true;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1])  {
                check = false;
                break;
            }
        }
        return check;
    } 
    public static void main(String args[]) {
        int arr[] = {1,3,4,5,6,7};
        System.out.println(printArray(arr));

    }
    
}
