package MODUL1;
import java.util.Scanner;
public class PRAK103_2410817210011_MUHAMMADDZULFATHIAHYAN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Panjang Deret dan Bilangan Awalnya : ");
		int Panjang = scan.nextInt();
		int nilaiAwal = scan.nextInt();
		
		int count = 0;
		int nilaiSekarang = nilaiAwal;
		
		do {
			if(nilaiSekarang % 2 != 0 ) {
				System.out.print(nilaiSekarang);
				count ++;
				if (count < Panjang) {
					System.out.print(", ");
				}
			}
		nilaiSekarang ++;
		}while (count < Panjang);
		
		scan.close();

	}

}