class BinarySearch{
    public static void main(String[] args) {
        int [] arr = {-5 , -2 , 4 , 5 , 7, 8 ,9};
        int target = 8;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    // Return the index
    // Return -1 if it does not exist 

    static int BinarySearch(int [] arr , int target ){

        int start = 0;
        int end = arr.length - 1;

        while( start <= end){

            // find the middle element 
            // int mid = (start + (end - start) / 2)
            // Might be possible that it exceed  

            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;

            }else if(target > arr[mid]){
                start = mid + 1;
                
            }else{

                // ans found

                return mid;
            }
        }
        return -1;
    }
}