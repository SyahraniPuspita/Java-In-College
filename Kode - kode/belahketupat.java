package bintangbentuk;
import java.util.Scanner;
public class belahketupat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan tinggi belah ketupat = ");
		int n = input.nextInt();
		
		if(n%2==0) {
			for(int x=1;x<=(n/2);x++) {
				for(int y=(n/2);y>=x;y--) {
					System.out.print(" ");
				}
				for(int z=1;z<=x;z++) {
					System.out.print("*");
				}
				for(int w=1;w<=x-1;w++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			for(int a=2;a<=(n/2)+1;a++) {
				for(int b=1;b<=a-1;b++) {
					System.out.print(" ");
				}
				for(int c=(n/2)+1;c>=a;c--) {
					System.out.print("*");
				}
				for(int d=(n/2);d>=a;d--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}else {
			for(int x=1;x<=(n/2);x++) {
				for(int y=(n/2);y>=x;y--) {
					System.out.print(" ");
				}
				for(int z=1;z<=x;z++) {
					System.out.print("*");
				}
				for(int w=1;w<=x-1;w++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			for(int a=1;a<=(n/2)+1;a++) {
				for(int b=1;b<=a-1;b++) {
					System.out.print(" ");
				}
				for(int c=(n/2)+1;c>=a;c--) {
					System.out.print("*");
				}
				for(int d=(n/2);d>=a;d--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
