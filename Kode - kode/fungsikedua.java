package function;

import java.util.*;

public class fungsikedua {
	
	
	
	
	public static void luas_tembok(int  p, int l) {
		
		int tembok = p*l;
		System.out.println("Luas tembok = " + tembok);
	}
	public static void luas_atap(int a, int b) {
		int atap = (a*b)/2;
		System.out.println("Luas atap = " + atap);
	}
	public static void luas_rumah(int p, int l, int a, int b) {
		int rumah = (p*l) + (a*b)/2;
		System.out.println("luas rumah = " + rumah);	
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan panjang = ");
		int p = input.nextInt();
		System.out.print("masukkan lebar = ");
		int l = input.nextInt();
		luas_tembok(p,l);
		
		System.out.print("masukkan panjang a = ");
		int a = input.nextInt();
		System.out.print("masukkan panjang b = ");
		int b = input.nextInt();
		luas_atap(a,b);
		
		luas_rumah(p,l,a,b);
		//tugas = cara agar luas_tembok dan luas_atap bisa ditransfer ke luas_rumah
	}

}
