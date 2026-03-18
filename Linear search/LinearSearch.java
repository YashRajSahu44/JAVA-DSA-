/* Linear Search
 Go through every element and check if it matches the target 
 

 -Algorithm
 1.Starts from index 0 
 2.Compare each elements with the target 
 3.if found return the index
 4.If not found return -1

 -Time complexity
 Best case : If found at start 0(1)
 worst case : If not found 0(n)

 -Space complexity
 0(1)
*/

// Code for linear search

class LinarSearch{
    public static void main(String[] args) {
       int [] arr = {61,62,63,64,65,66};
       int target = 66;
       int ans = LinarSearch(arr, target);
       System.out.println(ans);
    }
    //Search in the array : return the index if item found
    //otherwise if item is not found return -1

    static int LinarSearch(int [] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        //Run a for loop 
        for(int index = 0; index < arr.length; index ++){
            //Check for element at every index if it is = target 

            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed 
        // Hence the target not found

        return -1;

    }
}
