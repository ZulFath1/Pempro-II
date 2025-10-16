package MODUL3.PRAK301_MUHAMMADDZULFATHIAHYAN_2410817210011;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah Dadu : ");
		int jumlahDadu = scan.nextInt();
		
		dadu.tampilkanHasil(jumlahDadu);
		
		scan.close();

	}

}