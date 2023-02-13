public class SecondLargetElement { 
    static int findMax(int [] arr) { 
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static int findSec(int [] arr) {
        int mx = findMax(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String args[]) {
        
        int arr[] = {2,3,4,6,7,9,10};

        System.out.println(findSec(arr));
    }
    
}
