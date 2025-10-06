package PRKA201_241087210011_MUHAMMADDZULFATHIAHYAN;
public class Soal1Main {

	public static void main(String[] args) {
		buah apel = new buah("Apel", 7000, 0.4);
		buah mangga = new buah ("Mangga", 3500, 0.2);
		buah alpukat = new buah ("Alpukat", 10000, 0.25);
		
		apel.setJumlahBeli(40.0);
		mangga.setJumlahBeli(15.0);
		alpukat.setJumlahBeli(12.0);
		
		apel.tampilkanInfo();
		mangga.tampilkanInfo();
		alpukat.tampilkanInfo();
	}
}