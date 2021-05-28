package function;

import java.util.*;

public class prosedurarray {
	public static int ukbaju (int A[]) {
		if(A[0]==1) {
			System.out.println("UKURAN KECIL");
		}else if(A[0]==2) {
			System.out.println("UKURAN SEDANG");
		}else {
			System.out.println("UKURAN BESAR");
		}
		return A[0];
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan ukuran baju = ");
		int A[] = new int [1];
		for(int i=0;i<A.length;i++) {
			A[i] = input.nextInt();
		}
		ukbaju(A);
	}

}
