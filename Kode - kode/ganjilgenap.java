package function;

import java.util.*;

import java.util.Arrays;

public class ganjilgenap {
	public static int[] ganjil (int A[]) {
		
		 for(int j=0;j<A.length;j++) {
			 if(A[j]%2!=0) {
				 System.out.print(A[j] + ","); 
			 }
		 }
		 System.out.println(" ");
		 return A;
	}
	public static int[]	 genap (int A[]) {
		
		for(int k=0;k<A.length;k++) {
			if(A[k]%2==0){
				System.out.print(A[k]+",");
			}
			
		}
		System.out.println(" ");
		return A;
	}
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		   int A[] = new int [6];
		        for( int i = 0; i < A.length; i++ ){
		           
		            A[i] = in.nextInt();
		        }
		        System.out.println("Masukkan 6 bilangan : ");
		        System.out.println(Arrays.toString(A));
		        
		        ganjil(A);
		        genap(A);
	}

}
