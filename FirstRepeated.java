public class FirstRepeated { 
    public static int findFirst(int arr[]) {
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;i++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {2,3,4,5,3,2,4};
        System.out.println("The first repeated elemnt is = "+findFirst(arr));

    }
    
}
