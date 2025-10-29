package MODUL4.PRAK402_MUHAMMADDZULFATHIAHYAN_2410817210011;

public class Kucing extends HewanPeliharaan {
	private String warnaBulu;
	
	public Kucing(String r, String n, String w) {
		super(r,n);
		this.warnaBulu = w;
	}
	
	public void displayDetailKucing() {
		super.Display();
		System.out.println("Memiliki warna bulu: " + warnaBulu);
	}
}
