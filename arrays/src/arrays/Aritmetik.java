package arrays;

public class Aritmetik {
	public static void main(String[] args) {
		int sayi[] = {10, 5, 23, 1, 0, 3, 12, 20};
		int toplam = 0;
		for(int i = 0; i < sayi.length; i++) {
			toplam += sayi[i];
		}
		System.out.println("Ortalama: " + toplam /sayi.length);;
	}
}