package MODUL3.PRAK301_MUHAMMADDZULFATHIAHYAN_2410817210011;
import java.util.LinkedList;
import java.util.Random;
public class dadu {
	private int nilai;
	
	public dadu() {
		this.acakNilainya();
	}
	
	private void acakNilainya() {
		this.nilai = new Random(). nextInt(6) + 1;
	}
	
	public static void tampilkanHasil(int jumlahDadu) {
		LinkedList<dadu> semuaDadu = new LinkedList<>();
		int totalNilai = 0;
		
		for(int i = 0; i < jumlahDadu; i++) {
			semuaDadu.add(new dadu());
		}
		
		for (int i = 0; i < semuaDadu.size(); i++) {
			dadu daduSaatIni = semuaDadu.get(i);
			int nilaiDadu = daduSaatIni.getNilai();
			
			System.out.println("Dadu ke- " + ( i + 1) +" bernilai " + nilaiDadu);
			totalNilai += nilaiDadu;
		}
		
		System.out.println("Total Nilai Dadu Keseluruhan : " + totalNilai);
	}
	
	//setter
	public int getNilai() {
		return this.nilai;
	}
	
	//getter
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
}