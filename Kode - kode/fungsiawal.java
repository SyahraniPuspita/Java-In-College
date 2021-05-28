package function;

public class fungsiawal {
	
	public static void luas_tembok() {
		
		int tembok = 4*7;
		System.out.println("luas tembok = " + tembok );
	}
	public static void luas_atap() {
		float atap = (4*9)/2;
		System.out.println("luas atap = " + atap);
	}
	public static void rumah() {
		luas_tembok();
		luas_atap();
	}
	
	public static void main(String[] args){
		rumah();
		
		/*int y,x;
		x=5;
		y= hitung (x);
		System.out.println("x = " + x + ",y = " + y);
		
		x=8;
		y=hitung(x);
		System.out.println("x = " + x + ",y = " + y);
	}
	static int hitung (int input) {
		int hasil;
		hasil= input*input;
		return hasil;
	}*/
}
}