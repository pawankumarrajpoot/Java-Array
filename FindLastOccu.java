public class FindLastOccu {
    public static int findLast(int arr[],int x) {
        int last = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == x) {
                last = i;
            }
        }
        return last;
    }
    public static void main(String args[]) {
        int arr[] = {3,4,5,6,3,2};
        int x = 2;

        System.out.println(findLast(arr,x));
    }
}