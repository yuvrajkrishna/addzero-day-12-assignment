public class five {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int evenCount = 0 ;
        int oddCount = 0;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]%2==0) evenCount++;
            else{
                oddCount++;
            }
        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);
    }
}
