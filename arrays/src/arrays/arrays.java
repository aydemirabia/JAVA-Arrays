 package arrays;

import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		/*int[] a;
		a = new int[10];
		
		for(int i=0;i<10;i++) {
			//System.out.println(a[i]);
			a[i] = i;
			System.out.println(a[i]);
		}*/
		int[] a=new int[10];
		int i=0;
		int sonuc=0;
		
		Scanner scan =new Scanner(System.in);
		while(i<5) {
			System.out.print((i+1)+". sayiyi giriniz: ");
			a[i]=scan.nextInt();
			i++;
		}
		for(int j=0;j<5;j++) {
			sonuc=sonuc+a[j];
		}
		System.out.println("Sonuc: "+sonuc);
	}

}
