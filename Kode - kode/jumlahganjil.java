package function;

import java.util.*;
import java.util.Arrays;

public class jumlahganjil {
	public static int[] ganjil (int A[], int n) {
		int container =0;
		System.out.print("Nilai ganjil array = ");
		for (int j=0;j<n;j++) {
			if(A[j]%2!=0){
				System.out.print(A[j] + ",");
				container++;
			}
		}
		System.out.println(" ");
		//output
		System.out.println(container);
		return A;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input
		System.out.print("N = ");
		int n = input.nextInt();
		int A[] = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = input.nextInt();
		}
		System.out.print("Isi Array = ");
		System.out.println(Arrays.toString(A));
		
		ganjil(A,n);
	}

}
