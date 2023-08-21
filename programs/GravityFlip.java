package programs;


import java.util.Arrays;
import java.util.Scanner;

/*
Input
    The first line of input contains an integer n (1 ≤ n ≤ 100), 
    the number of the columns in the box. The next line contains n space-separated integer 
    numbers. The i-th number ai (1 ≤ ai ≤ 100) denotes the number of cubes in the 
    i-th column.
Output
    Output n integer numbers separated by spaces, where the i-th number is the amount of 
    cubes in the i-th column after the gravity switch.
 */
public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        scanner.close();
    }
    
}
