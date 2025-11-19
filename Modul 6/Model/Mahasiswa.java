package Model;

public class Mahasiswa {
	private int id;
	private String nim;
	private String nama;
	private String hobi;
	private String makananFavorit;
	
	public Mahasiswa(int id, String nim, String nama, String hobi, String makananFavorit) {
		this.id = id;
		this.nim = nim;
		this.nama = nama;
		this.hobi = hobi;
		this.makananFavorit = makananFavorit;
		}
	
	//setter
    public void setId(int id) {
    		this.id = id; 
    		}

    public void setNim(String nim) { 
    		this.nim = nim; 
    		}

    public void setNama(String nama) { 
    		this.nama = nama; 
    		}
    
    public void setHobi(String hobi) { 
    		this.hobi = hobi; 
    		}
    
    public void setMakananFavorit(String makananFavorit) { 
    		this.makananFavorit = makananFavorit; 
    		}
    
    //getter
    public int getId() { 
		return id; 
		}
    
    public String getNim() { 
		return nim; 
		}
    
    public String getNama() { 
		return nama; 
		}
    
    public String getHobi() { 
		return hobi; 
		}
    
    public String getMakananFavorit() { 
		return makananFavorit; 
		}
}