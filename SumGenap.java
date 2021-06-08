import java.util.Scanner;

public class SumGenap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Masukkan Bilangan Bulat : ");
		int bilbul = sc.nextInt();

		int sum = 0;

		for (i = 0 ; i < bilbul ; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("Jumlah Bilangan Bulat Genap Positif Pertama : %d", sum);
	}
}