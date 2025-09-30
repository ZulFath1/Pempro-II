package MODUL1;
import java.util.Scanner;
import java.util.Locale;
public class PRAK105_2410817210011_MUHAMMADDZULFATHIAHYAN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		final double phi = 3.14;
		
		System.out.print("Masukkan Jari Jari : ");
		double jariJari= scan.nextDouble();
		
		System.out.print("Masukkan Tinggi : ");
		double tinggi = scan.nextDouble();
		
		scan.close();
		
		double volume = phi * jariJari * jariJari * tinggi;
		
		System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jariJari, tinggi, volume);
	}

}