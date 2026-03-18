// Search for 3 in the range of index [1,4] of the arr [18, 12, -7,3, 14, 28]

class SearchInRange{
    public static void main(String[] args) {
        int [] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int ans = LinearSearch(arr,target,1,4);
        System.out.println(ans);
    }
    static int LinearSearch( int [] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i < end; i ++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}