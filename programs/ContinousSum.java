package programs;
import java.util.Scanner;

public class ContinousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        int n=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int maxVal = Integer.MIN_VALUE,tempSum=0;
        for(int i=0;i<size-n;i++){
            for(int count=i;count<n;count++){
                tempSum +=arr[count];
            }
            if(maxVal<tempSum){
                maxVal=tempSum;
            }
            tempSum=0;
        }
        System.out.println(maxVal);
        sc.close();
    }
}
