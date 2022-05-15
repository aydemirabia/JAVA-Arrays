package arrays;

public class IkiBoyutlu {

	public static void main(String[] args) {
		int a1[][]  = {{1, 2, 3}, {4, 5, 6}};
		int a2[][] = {{1, 2}, {4}};
		
		String yaz = "a1: \n";
		yaz += ikiboyutYazdir(a1);
		
		yaz += "\na2: \n";
		yaz += ikiboyutYazdir(a2);
		System.out.println(yaz);
		System.exit(0);
	}
	
	public static String ikiboyutYazdir(int a[][]) {
		String yaz = "";
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				yaz += String.valueOf(a[i][j]);
				yaz += "\t";
			}
			yaz += "\n";
		}
		return yaz;
	}

}