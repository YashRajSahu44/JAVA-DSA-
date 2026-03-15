import java.util.Arrays;
import java.util.Scanner;
class input{
    public static void main(String[] args) {
        
        // Using Scanner +  for each loop
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // To string method

        // System.out.println("Array element are");
        // for(int num : arr){//for every element int the array, print the element 
        //     System.out.print(num + " "); //Here num represents elements of the array
        
        }
    }
//}