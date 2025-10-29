package MODUL4.PRAK401_MUHAMMADDZULFATHIAHYAN_2410817210011;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nama Hewan Peliharaan : ");
		String n = scan.nextLine();
		
		System.out.print("Ras : ");
		String r = scan.nextLine();
		
		HewanPeliharaan Hewan = new HewanPeliharaan(r,n);
		
		Hewan.display();
		
		scan.close();
	}

}
