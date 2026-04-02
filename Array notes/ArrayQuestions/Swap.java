import java.util.Arrays;

class Swap{
    public static void main(String[] args) {
        
        int [] arr = {15,13,14,12,7};
        Swap(arr, 1 ,2 );
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int [] arr , int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}