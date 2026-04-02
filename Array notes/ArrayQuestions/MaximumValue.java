class MaximumValue{
    public static void main(String[] args) {
        
        int [] arr = {15,14,13,12,7};
        
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
         if (arr[i]>max){
            max = arr[i];
         }
        }
        System.out.println(max);
    }
}