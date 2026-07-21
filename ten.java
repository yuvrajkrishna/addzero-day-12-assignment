public class ten {
    public static void main(String[] args) {
        int arr [] = {10,20,3,40,50,60};
        int n = arr.length;
        int num = 90;
        int status = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(num == arr[i]){
                status = 1;
                break;
            }
        }
        if(status == 1){
            System.out.println("The element is present");
        }
        else{
            System.out.println("The element is not present");
        }
    }
}
