package MODUL4.PRAK401_MUHAMMADDZULFATHIAHYAN_2410817210011;

public class HewanPeliharaan {
	private String nama;
	private String ras;
	
	public HewanPeliharaan(String r, String n){
		this.ras = r;
		this.nama = n;
	}
	
	public void display() {
		System.out.println("");
		System.out.println("Detail Hewan Peliharaan : ");
		System.out.println("Nama Hewan Peliharaan : " + nama);
		System.out.println("Dengan Ras : " + ras);
	}
}
