package fibonacci;

import java.util.*;

public class fibonacciku {
	public static void main(String[] args){
		
		//dalam variabel
		System.out.println("Soal Fibonacci");
		
		int n1 = 1;
		int n2 = 2;
		int n3;
		
		System.out.print(n1 + "," + n2);
		for(int i=1;i<=5;i++) {
			n3 = n1 + n2;
			System.out.print("," + n3);
			n1 = n2; n2 = n3;
		}
		System.out.println(" \n");
		
		//input keyboard
		System.out.println("MENENTUKAN BILANGAN FIBONACCI KE-N");
		int f1 = 1;
		int f2 = 2;
		int f3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Silahkan masukkan n = ");
		int n = input.nextInt();
		
		System.out.print(f1 + "," + f2);
		
		for(int j=0;j<=n;j++) {
			f3 = f1 + f2;
			System.out.print("," + f3);
			f1 = f2; f2 = f3;
		}
		
		
		
		
	}

}
