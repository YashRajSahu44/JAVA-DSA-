class MinimumNumber{
    public static void main(String[] args) {
        int [] arr = {79,90,88,22,34,55,6};
        System.out.println(min(arr));
    }
    static int min(int [] arr){

        // asume arr.lenght != 0
        // Rrturn the min value
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}