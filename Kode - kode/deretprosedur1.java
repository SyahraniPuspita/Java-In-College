package deretprosedur;

import java.util.*;

public class deretprosedur1 {
	//hitung jumlah deret
	public static void hasil(int n){
		int hasil=0;
		for(int i=0;i<=n;i++) {
			int a=3*i;
			hasil+=a;
		}
		System.out.println("Jumlah deret suku ke - " + n + " adalah " + hasil);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println(("3,6,9,..."));
		System.out.print("Jumlah deret suku ke-  ");
		int n = input.nextInt();
		
		hasil(n);
		
		
}
}