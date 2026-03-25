// floor = greatest number or smaller or == target

// follows same approach as CeilingOfNumber just return end insted of -1


class CeilingOfNumber {
    public int searchInsert(int[] nums, int target) {
    int start = 0;
        int end = nums.length - 1;
        while( start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if( target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end; //Here is the change     
    }
}
