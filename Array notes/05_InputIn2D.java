import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[]row : arr){
            System.out.println(Arrays.toString(row));
        }
        
    }
}
