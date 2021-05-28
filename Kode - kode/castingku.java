package casting;

public class castingku {
	public static void main(String[] args){
		
		//String ke Double
		int x = 6;
		int y = 5;
		
		int  z = x%y;
		
		System.out.println(z);
		
		//String ke Integer
		String r = "67";
		String t = "5";
		
		int c = Integer.parseInt(r) / Integer.parseInt(t);
		
		System.out.println(c);
		
		//tinggal diganti ke tipe data yang dibutuhkan
		
		int a = 2;
		int b = 3;
		float f ;
		
		f = ((float)a+(float)b)/2;
		System.out.println(f);
	}

}
