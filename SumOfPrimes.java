import java.util.*;

public class SumOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int flag,sum=0;
		for(int i=start;i<end;i++){
			flag=0;
			for(int j=2;j<i/2;j++){
				if(i%j==0){
					flag=-1;
					break;
				}
			}
			if(flag==0){
				sum+=i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}