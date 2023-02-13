public class UniqueArray {
    public static void findUnique(int arr[]) {
        int ans = -1;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] != arr[j]) {
                    ans = arr[i];
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]) {
        int arr[] = {2,3,2,4,3};
        findUnique(arr);

    }
}