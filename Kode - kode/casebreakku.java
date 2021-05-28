package casebreak;

import java.util.*;

import java.util.*;

public class casebreakku {
	public static void main(String[] args){
		
		//CASE MEMILIH UKURAN BAJU
		System.out.println("MEMILIH UKURAN");
		int size = 2;
		System.out.println("ukuran yang dipilih adalah " + size);
		
		switch (size) {
		case(2) : System.out.println("Ukuran Dewasa"); break;
		case(2*3) : System.out.println("Ukuran Remaja"); break;
		case(3) : System.out.println("Ukuran Anak-anak"); break;
		default :
			System.out.println("ukuran error");
		}
		System.out.println("\n");
		
		//CASE MEMILIH UKURAN BAJU (input keyboard)
		System.out.println("MEMILIH UKURAN");
		char size1;
		Scanner input = new Scanner(System.in);
		System.out.print("sILAHKAN MASUKKAN UKURAN (L/M/S) = ");
		size1 = input.next().charAt(0);
		
		switch (size1) {
		case('L') : System.out.println("Ukuran Dewasa"); break;
		case('M') : System.out.println("Ukuran Remaja"); break;
		case('S') : System.out.println("Ukuran Anak-anak"); break;
		default :
			System.out.println("ukuran error");
		}
		
		
		
		int n = 6;
		int m = 5;
		int z = n%m;
		System.out.println(z);
	}
	
	

}
