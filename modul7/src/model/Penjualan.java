package model;

import javafx.beans.property.*;

public class Penjualan {
    private IntegerProperty penjualanId;
    private IntegerProperty jumlah;
    private IntegerProperty totalHarga;
    private StringProperty tanggal;
    private IntegerProperty pelangganId;
    private IntegerProperty bukuId;

    // --- KONSTRUKTOR ---

    // 1. Kosong
    public Penjualan() {
        this(0, 0, 0, "", 0, 0);
    }

    // 2. Tambah Data (Create)
    public Penjualan(int jumlah, int totalHarga, String tanggal, int pelangganId, int bukuId) {
        this(0, jumlah, totalHarga, tanggal, pelangganId, bukuId);
    }

    // 3. Lengkap (Read)
    public Penjualan(int id, int jumlah, int totalHarga, String tanggal, int pelangganId, int bukuId) {
        this.penjualanId = new SimpleIntegerProperty(id);
        this.jumlah = new SimpleIntegerProperty(jumlah);
        this.totalHarga = new SimpleIntegerProperty(totalHarga);
        this.tanggal = new SimpleStringProperty(tanggal);
        this.pelangganId = new SimpleIntegerProperty(pelangganId);
        this.bukuId = new SimpleIntegerProperty(bukuId);
    }

    // --- GETTER & SETTER ---

    public IntegerProperty penjualanIdProperty() { 
    		return penjualanId; 
    		}
    
    public int getPenjualanId() { 
    		return penjualanId.get(); 	
    		}
    
    public void setPenjualanId(int id) { 
    		this.penjualanId.set(id); 
    		}

    public IntegerProperty jumlahProperty() { 
    		return jumlah; 
    		}
    
    public int getJumlah() { 
    		return jumlah.get(); 
    		}
    public void setJumlah(int jumlah) { 
    		this.jumlah.set(jumlah); 
    		}

    public IntegerProperty totalHargaProperty() { 
    		return totalHarga; 
    		}
    
    public int getTotalHarga() { 
    		return totalHarga.get(); 
    		}
    
    public void setTotalHarga(int totalHarga) { 
    		this.totalHarga.set(totalHarga); 
    		}

    public StringProperty tanggalProperty() { 
    		return tanggal; 
    		}
    
    public String getTanggal() { 
    		return tanggal.get(); 
    		}
    
    public void setTanggal(String tanggal) { 
    		this.tanggal.set(tanggal); 
    		}

    public IntegerProperty pelangganIdProperty() { 
    		return pelangganId; 
    		}
    
    public int getPelangganId() { 
    		return pelangganId.get(); 
    		}
    
    public void setPelangganId(int id) { 
    	this.pelangganId.set(id); 
    	}

    public IntegerProperty bukuIdProperty() { 
    		return bukuId; 
    		}
    
    public int getBukuId() { 
    		return bukuId.get(); 
    		}
    
    public void setBukuId(int id) { 
	    	this.bukuId.set(id); 
	    	}
}
