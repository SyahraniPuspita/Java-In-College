package bangunruangkkuis;

import java.util.Scanner;

public class bangunruang {
	public static int segiempat(int a,int b, int c, int d) {
		int luas = a*b;
		int luas1 = c*d;
		int luastotal = luas + luas1;
		return luastotal;
	}
	public static int segitiga(int A,int T) {
		int luas = (A*T);
		return luas;
	}
	public static void seluruh(int a,int b,int c,int d,int A,int T) {
		int luas1 = segiempat(a,b,c,d);
		int luas2 = segitiga (A,T);
		int luastotal = luas1+luas2;
		System.out.println("luas segi empat = " + luas1);
		System.out.println("luas segi tiga = " + luas2);
		System.out.println("luas total = " + luastotal);
		
		
		
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan nilai a = ");
		int a = input.nextInt();
		System.out.print("masukkan nilai b = ");
		int b = input.nextInt();
		System.out.print("masukkan nilai c = ");
		int c = input.nextInt();
		System.out.print("masukkan nilai d = ");
		int d = input.nextInt();
		System.out.print("masukkan nilai A = ");
		int A = input.nextInt();
		System.out.print("masukkan nilai T = ");
		int T = input.nextInt();
		
		seluruh(a,b,c,d,A,T);
		
		
		
		
		
	}

}
