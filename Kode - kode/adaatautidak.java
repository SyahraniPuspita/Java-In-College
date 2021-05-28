package function;

import java.util.*;

public class adaatautidak {
	public static int[] ada (int A[], int X,int n) {
		for(int j=0;j<n;j++) {
			if(X==A[j]) {
				System.out.println("nilai " + X + " ada di dalam array");
				break;
				
			}else {
				continue;
				
			}
		}
		return A;
	}
	public static int[] tidak (int A[], int X, int n) {
		for(int k=0;k<n;k++) {
			if(X==A[k]) {
				continue;
				
			}else if(k==n-1 && X!=A[k]){
				System.out.println("nilai " + X + " tidak ada di dalam array");
				
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N = ");
		int n = input.nextInt();
		int A[] = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = input.nextInt();
		}
		System.out.print("Isi Array = ");
		System.out.println(Arrays.toString(A));
		System.out.print("X = ");
		int X = input.nextInt();
		
		ada(A,X,n);
		tidak(A,X,n);
		
	}

}
