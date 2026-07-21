public class three {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int sum = 0 ;
        int length = arr.length;
        for(int i = 0 ; i < length ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
