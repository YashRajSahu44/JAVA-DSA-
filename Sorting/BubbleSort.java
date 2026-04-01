class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            // Last i elements are already sorted
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}