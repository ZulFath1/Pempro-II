package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Buku {
    private IntegerProperty bukuId;
    private StringProperty judul;
    private StringProperty penulis;
    private IntegerProperty harga;
    private IntegerProperty stok;

    public Buku() {
        this(0, "", "", 0, 0);
    }

    // konstruktor add
    public Buku(String judul, String penulis, int harga, int stok) {
        this(0, judul, penulis, harga, stok);
    }

    public Buku(int id, String judul, String penulis, int harga, int stok) {
        this.bukuId = new SimpleIntegerProperty(id);
        this.judul = new SimpleStringProperty(judul);
        this.penulis = new SimpleStringProperty(penulis);
        this.harga = new SimpleIntegerProperty(harga);
        this.stok = new SimpleIntegerProperty(stok);
    }

    // setter dan getter
    public IntegerProperty bukuIdProperty() {
        return bukuId;
    }

    public int getBukuId() {
        return bukuId.get();
    }

    public void setBukuId(int id) {
        this.bukuId.set(id);
    }

    public StringProperty judulProperty() {
        return judul;
    }

    public String getJudul() {
        return judul.get();
    }

    public void setJudul(String judul) {
        this.judul.set(judul);
    }

    public StringProperty penulisProperty() {
        return penulis;
    }

    public String getPenulis() {
        return penulis.get();
    }

    public void setPenulis(String penulis) {
        this.penulis.set(penulis);
    }

    public IntegerProperty hargaProperty() {
        return harga;
    }

    public int getHarga() {
        return harga.get();
    }

    public void setHarga(int harga) {
        this.harga.set(harga);
    }

    public IntegerProperty stokProperty() {
        return stok;
    }

    public int getStok() {
        return stok.get();
    }

    public void setStok(int stok) {
        this.stok.set(stok);
    }
    
    @Override
    public String toString() {
        return getJudul();
    }
}