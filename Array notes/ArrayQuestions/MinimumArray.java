class MinimumArray{
    public static void main(String[] args) {
        
        int[]arr = {15,12,13,14,7};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
              min = arr[i];
            }
        }
        System.out.println(min);
    }
}