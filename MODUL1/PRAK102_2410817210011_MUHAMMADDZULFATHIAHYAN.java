package MODUL1;
import java.util.Scanner;
public class PRAK102_2410817210011_MUHAMMADDZULFATHIAHYAN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan Nilai Awal ");
		int nilaiAwal = scan.nextInt();
		int i = 0;
		
		while(i<=10) {
			int bilangan = nilaiAwal + i;
			
			if( bilangan % 5 == 0) {
				System.out.print((bilangan/5-1));
			}else {
				System.out.print(bilangan);
			}
			if (i<10) {
				System.out.print(", ");
			}
			i++;
		}
			
		scan.close();
		System.out.println();
	}
}