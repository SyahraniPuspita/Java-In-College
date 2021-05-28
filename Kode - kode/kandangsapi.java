package function;

import java.util.*;

public class kandangsapi {
	public static void sapi (int sapi) {
		System.out.print("|-");
		for(int i=1;i<=sapi;i++) {
			System.out.print("-");
		}
		System.out.print("-|");
		System.out.println(" ");
		System.out.print("| ");
		for(int j=1;j<=sapi;j++) {
			System.out.print("X");
		}
		System.out.print(" |");
		System.out.println(" ");
		System.out.print("|-");
		for(int k=1;k<=sapi;k++) {
			System.out.print("-");
		}
		System.out.print("-|");
		System.out.println(" ");
		
	}
		
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan jumlah sapi = ");
		int sapi = input.nextInt();
		sapi(sapi);
	}

}
