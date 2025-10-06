package PRKA203_241087210011_MUHAMMADDZULFATHIAHYAN;

//pada baris dibawah ini terdapat kesalahan karena nama class adalah 'Employee' 
//sedangkan pada file Soal3Main.java, objek dibuat dari class 'Pegawai'. Maka nama class harus sama saat pembuatan objek.
//public class Employee{
public class Pegawai {  
	public String nama;
	
	//pada baris di bawah ini terjadi error karena tipe data untuk 'asal' adalah char, yang hanya bisa menampung satu karakter.
	//sedangkan di Soal3Main, variabel ini diisi dengan String "Kingdom of Orvel".
	//public char asal;
	public String asal;
	public String jabatan;
	public int umur;
	
	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}
	
	//pada baris di bawah ini terjadi error akibat method setJabatan tidak memiliki parameter untuk menerima input. 
	//sehingga variabel j tidak terdefinisi.
	//public void setJabatan() {
	public void setJabatan(String j) {
		this.jabatan = j;	
	}
}