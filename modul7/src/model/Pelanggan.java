package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pelanggan {
    private IntegerProperty pelangganId;
    private StringProperty nama;
    private StringProperty email;
    private StringProperty telepon;


    // (Default)
    public Pelanggan() {
        this(0, "", "", "");
    }

    // konstruktor add
    public Pelanggan(String nama, String email, String telepon) {
        this(0, nama, email, telepon);
    }

    // konstruktor read
    public Pelanggan(int id, String nama, String email, String telepon) {
        this.pelangganId = new SimpleIntegerProperty(id);
        this.nama = new SimpleStringProperty(nama);
        this.email = new SimpleStringProperty(email);
        this.telepon = new SimpleStringProperty(telepon);
    }

    // setter dan getter
    public IntegerProperty pelangganIdProperty() {
        return pelangganId;
    }

    public int getPelangganId() {
        return pelangganId.get();
    }

    public void setPelangganId(int id) {
        this.pelangganId.set(id);
    }

    public StringProperty namaProperty() {
        return nama;
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty teleponProperty() {
        return telepon;
    }

    public String getTelepon() {
        return telepon.get();
    }

    public void setTelepon(String telepon) {
        this.telepon.set(telepon);
    }
    
    @Override
    public String toString() {
        return getNama(); 
    }
}