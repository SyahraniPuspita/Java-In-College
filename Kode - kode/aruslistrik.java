package arus;

import java.util.*;

public class aruslistrik {
	
	//prosedur
	
	public static void lampu1 (int value) {
		if(value==1) {
			System.out.println("lampu 1 = ON");
		}else if(value==0) {
			System.out.println(("lampu 1 = OFF"));
		}
	}
	public static void lampu2 (int value){
		if(value==1) {
			System.out.println("lampu 2 = ON");
		}else if(value==0) {
			System.out.println("lampu 2 = OFF");
		}
	}
	public static void lampu3 (int value)	{
		if(value==1) {
			System.out.println("lampu 3 = ON");
		}else if(value==0) {
			System.out.println("lampu 3 = OFF");
		}
	}
	public static void lampu4 (int value) {
		if(value==1) {
			System.out.println("lampu 4 = ON ");
		}else if (value==0) {
			System.out.println("lampu 4 = OFF");
		}
	}
	//fungsi
	public static int lampu (int nilai) {
		if(nilai==1) {
			System.out.println(" 1 = OFF, 2 = ON, 3 = OFF, 4 = OFF");
		}else if (nilai==0){
			System.out.println(" 1 = ON, 2 = ON, 3 = ON, 4 = ON");
		}
		return nilai;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan value 0/1 = ");
		int value = input.nextInt();
		
		
		
		lampu1(value);
		lampu2(value);
		lampu3(value);
		lampu4(value);
		
		System.out.print("masukkan nilai 0/1 = ");
		int nilai = input.nextInt();
		
		lampu(nilai);
	}
	
	
	
	

	

	
		
				
		
	}


