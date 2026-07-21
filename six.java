public class six {
    public static void main(String[] args) {
        int [] arr = new int [] {10,20,30};
        int mth = 2;
        if (mth >= 0 && mth < arr.length) {
            System.out.println("The Mth Element Exists and its value is : " + arr[mth]);
        } 
        else {
            System.out.println("The Mth Element does not exist");
        }

        }
}
