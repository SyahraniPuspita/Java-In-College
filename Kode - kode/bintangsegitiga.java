package bintangbentuk;

import java.util.*;

public class bintangsegitiga {
	public static void main(String[] args){
		
		//bintang siku-siku kiri
		
		Scanner input = new Scanner(System.in);
		System.out.print("masukkkan nilai n = ");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
				if(j-i==0) {
					System.out.print(" ");
					break;
				}
			}
			System.out.println(" ");
		}
		
		//bintang siku-siku kiri bawah
		Scanner input1 = new Scanner(System.in);
		System.out.print("masukkan nilai n = ");
		int n1 = input.nextInt();
		
		for(int k=1;k<=n1;k++) {
			for(int l=1;l<=n1;l++) {
				System.out.print("*");
				if(k+l==n1+1) {
					System.out.print(" ");
					break;
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//bintang siku-siku kanan atas
		Scanner input2 = new Scanner(System.in);
		System.out.print("masukkan nilai n = ");
		int n2 = input.nextInt();
		

		for(int m=1;m<=n2/2;m++) {
			for(int o=1;o<=n2;o++) {
				System.out.print("*");
				if(m-o==0) {
					System.out.println(" ");
					break;
				}

			}
		}
		for(int a=1;a<=(n2/2);a++) {
			for(int b=1;b<=n2;b++) {
				System.out.print("*");
				if(a+b==n2+1) {
					System.out.println(" ");
					break;
				}
			}
		}
		
		int s = 5/2;
		System.out.println(s);
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Masukkan nilai n = ");
		int n3 = input.nextInt();
		
	
			
		
		for (int i=1;i<=(n3/2);i++){
            for(int j=(n3/2);j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
		for (int i=1;i<=((n3/2));i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int z=((n3/2));z>=i;z--){
             System.out.print("*");
             }
            for(int k=(n3/2);k>=i;k--){
              System.out.print("*");
              }
            System.out.println("");
        }

	}
		

}
