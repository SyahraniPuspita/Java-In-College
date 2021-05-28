package function;

import java.util.*;

public class faktorial {
	public static int faktorial(int n) {
		int total = 1;
		for(int i =1;i<=n;i++) {
			total= total*i;
		}
		return total;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("faktorial ke - ");
		int n = input.nextInt();
		
		int total=0;
		System.out.println("Faktorial ke - " + n + " adalah " +  faktorial(n));
	}

}
