class SearchInRotatedArray2 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start )/2;
            if(nums[mid] == target){
                return true;
            }

            //Check for duplicate elements

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start ++ ;
                end --;
            }
            // Check if left side is sorted
             else if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
             }

             // Check if right side is sorted

             else{
                if(target <= nums[end] && target >= nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
             }
        }
        return false;
    }
}