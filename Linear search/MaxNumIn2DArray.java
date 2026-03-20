public class MaxNumIn2DArray {
    public static void main(String[] args) {
        
        int  [][] arr = {
            {1 , 2 , 3},
            {4 , 5 , 6},
            {7 , 8 , 9},
        };
       
        System.out.println(max(arr));
    }

   //Maximum in 2D array

static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

