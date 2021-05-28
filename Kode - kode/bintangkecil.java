package function;

import java.util.*;

public class bintangkecil {
	//segitiga kebawah
	public static void bintang (int n) {
		for(int k=1;k<=n;k++) {
			for(int l=1;l<=n;l++) {
				System.out.print("*");
				if(k+l>=n+1) {
					System.out.print(" ");
					break;
				}
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		
		bintang(n);
		
	}
	

}
