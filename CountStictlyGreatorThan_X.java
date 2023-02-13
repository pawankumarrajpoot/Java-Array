public class CountStictlyGreatorThan_X { 
    public static int count(int arr[],int x) { 
        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] >x) {
                ans++;
            }
        }
        return ans;
    } 
    public static void main(String args[]) {
        int arr[] = {2,4,5,6,7,1,8};
        int  target = 5;
        System.out.println(count(arr,target));
    }
    
}
