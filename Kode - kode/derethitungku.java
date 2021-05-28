package derethitung;

import java.util.*;

public class derethitungku {
	public static void main(String[] args){
		
		//deret bilangan genap
		System.out.println("DERET BILANGAN GENAP");
		
		
		
		for (int i=1;i<=5;i++) {
			int deret = i*2;
			System.out.print( deret+ ",");
		}
		
		System.out.println(" ");
		
		//deret bilangan genap (input keyboard n)
        System.out.println("DERET BILANGAN GENAP");
		
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan nilai n = ");
		int n = input.nextInt();
		
		for (int i=1;i<=n;i++) {
			int deret = i*2;
			System.out.print( deret+ ",");
		}
	}

}
