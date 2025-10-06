package PRKA201_241087210011_MUHAMMADDZULFATHIAHYAN;

public class buah {
	private String namaBuah;
	private double berat;
	private double harga;
	private double jumlahBeli;
	
	public buah (String namaBuah, double hargaPerKg, double beratSatuan) {
		this.namaBuah = namaBuah;
		this.harga = hargaPerKg / beratSatuan;
		this.berat = beratSatuan;
	}
	
	public void setJumlahBeli(double jumlah) {
		this.jumlahBeli = jumlah;
	}
	
	public void tampilkanInfo() {
		double hargaSebelumDiskon = this.jumlahBeli * this.harga;
	
		double kelipatanDiskon = (int)(this.jumlahBeli/4);
		double totalDiskon = kelipatanDiskon * (0.02 * (4 * this.harga));
		
		double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;
		
		System.out.println("Nama Buah : " + this.namaBuah);
		System.out.println("Berat : " + this.berat);
		System.out.println("Harga : " + (this.harga * this.berat));
		System.out.println("Jumlah Beli : " + this.jumlahBeli + " Kg");
		System.out.printf("Harga sebelum diskon : Rp%.2f\n", hargaSebelumDiskon);
		System.out.printf("Total diskon : Rp%.2f\n",totalDiskon);
		System.out.printf("Harga setelah diskon : Rp%.2f\n\n", hargaSetelahDiskon);
	}
}