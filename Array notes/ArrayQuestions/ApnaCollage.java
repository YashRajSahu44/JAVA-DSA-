//take an array as input from the user
// search for a given number x and print the index at
// which it occurs

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to search
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        // Search for x
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;    // stop after first match
            }
        }

        // Output result
        if (index == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + index);
        }
    }
}
