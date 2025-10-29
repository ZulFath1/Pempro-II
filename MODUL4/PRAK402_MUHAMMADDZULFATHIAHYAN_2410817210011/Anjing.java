package MODUL4.PRAK402_MUHAMMADDZULFATHIAHYAN_2410817210011;

public class Anjing extends HewanPeliharaan {
	private String warnaBulu;
	private String[] kemampuan;
	
	public Anjing (String n, String r, String w, String[] k) {
		super(r, n);
		this.warnaBulu = w;
		this.kemampuan = k;
	}
	
	public void displayDetailAnjing() {
		super.Display();
		System.out.println("Memiliki warna bulu: " + warnaBulu);
		System.out.println("Memiliki Kemampuan: " + kemampuan);
	}
}