// Selection Sort : is a simple sorting algorithm where you repeatedly select the smallest element from the unsorted part and place it at the correct position.

// Selecting Maximum

class SelectionSort{
    public static void main(int [] arr) {
        
        int n = arr.length;

        for(int i = n-1; i > 0; i--){
            // Find the maximum element in the unsorted part
            int maxIndex = 0;

            for(int j = 1; j <= i; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            // Swap the found minimum with the last part of unsorted array

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
