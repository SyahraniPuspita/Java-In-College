package function;
import java.util.*;

public class totalbelanja {
	public static int[] total (int jumlahbarang[]) {
		int tbaju = jumlahbarang[0]*200000;
		//System.out.println("Harga Baju = " + tbaju);
		int tsepatu = jumlahbarang[1]*400000;
		//System.out.println("Harga sepatu = " + tsepatu);
		int ttopi = jumlahbarang[2]*50000;
		//System.out.println("Harga topi = " + ttopi);
		
		int subtotal[] = {tbaju,tsepatu,ttopi};
		return subtotal;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		 int jumlahbarang [] = new int [3];
		 String namabarang[] = {"baju", "sepatu", "topi"};
		 int totalharga=0;
		 for(int i=0;i<3;i++) {
			 System.out.print("Jumlah " + namabarang[i] + " = ");
			 jumlahbarang[i] = input.nextInt();
		 }
		 
		 for(int k=0;k<3;k++) {
			 System.out.println("Harga " + namabarang[k] + " = " + total (jumlahbarang)[k]);
		 }
		 for(int j=0;j<3;j++) {
			 totalharga += total (jumlahbarang) [j];
		 }
		System.out.println("Total belanja = " + totalharga);
	}

}
