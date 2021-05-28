package function;

import java.lang.Math;
import java.util.*;

public class nilaiterbesartanpaarray {
	public static int maks (int nilai, int max) {
		 max = Math.max(nilai, nilai);
	        if (nilai > max) {
	            max = nilai;
	        }
	        System.out.println("Angka maksimum adalah= "+max);
	        return max;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan 10 nilai = ");
		int nilai=0;
		for(int i=1;i<=10;i++) {
			 nilai = input.nextInt();
		}
		int max=0;
		maks(nilai,max);
	}

}
