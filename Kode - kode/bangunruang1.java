package bangunruang;

import java.util.*;

public class bangunruang1 {
	public static double segiempat (double p, double l) {
		double luas = p*l;
		System.out.println("Luas Segiempat adalah = " + luas );
		return luas;
	}
	public static double segitiga (double a, double t) {
		double luas = (a*t)/2;
		System.out.println("Luas Segitiganya adalah = " + luas);
		return luas;
	}
	public static void tenda (double p, double l, double a, double t) {
		double luas1 = segiempat(p,l);
		double luas2 = segitiga(a,t);
		double luastotal = luas1+luas2;
		System.out.println("Luas tenda keseluruhan = " + luastotal);
		
	}

	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan nilai panjang  = ");
		double p = input.nextDouble();
		System.out.println("Masukkan nilai lebar = ");
		double l = input.nextDouble();
		System.out.println("Masukkan nilai alas = ");
		double a = input.nextDouble();
		System.out.println("Masukkan nilai tinggi = ");
		double t = input.nextDouble();
		
		
		tenda(p,l,a,t);
		
}
}