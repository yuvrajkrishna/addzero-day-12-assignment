public class six {
    public static void main(String[] args) {
        int [] arr = new int [] {10,20,30};
        int mth = 2;
        int n = arr.length;
        int check = 0;
        for(int i = 0 ; i < n; i++){
            if(i == mth){
                check  = 1;
            }
        }
        if(check == 1){
            System.out.println("The Mth Element Exists and its value is : " + arr[mth]);
        }

        else{
            System.out.println("The Mth Element is not Exists");
        }

        }
}
