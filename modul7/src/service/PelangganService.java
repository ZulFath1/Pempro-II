package service;

import dao.PelangganDao;
import dao.impl.PelangganDaoImpl;
import model.Pelanggan;
import java.util.List;

public class PelangganService {
    private final PelangganDao pelangganDao = new PelangganDaoImpl();

    public List<Pelanggan> getAllPelanggan() {
        return pelangganDao.getAllPelanggan();
    }

    public void addPelanggan(String nama, String email, String telepon) throws Exception {
        // Validasi menggunakan parameter terpisah (Bukan objek)
        validasiData(nama, email, telepon);
        
        Pelanggan pelanggan = new Pelanggan(nama, email, telepon);
        pelangganDao.addPelanggan(pelanggan);
    }

    public void updatePelanggan(Pelanggan pelanggan) throws Exception {
        // Pecah objek menjadi parameter saat memanggil validasi
        validasiData(pelanggan.getNama(), pelanggan.getEmail(), pelanggan.getTelepon());
        
        pelangganDao.updatePelanggan(pelanggan);
    }

    public void deletePelanggan(int id) {
        pelangganDao.deletePelanggan(id);
    }

    private void validasiData(String nama, String email, String telepon) throws Exception {
        // 1. Validasi Nama
        if (nama == null || nama.trim().isEmpty()) {
            throw new Exception("Nama pelanggan wajib diisi!");
        }

        // 2. Validasi Email
        if (email == null || email.trim().isEmpty()) {
            throw new Exception("Email wajib diisi!");
        }
        if (!email.contains("@")) {
            throw new Exception("Format email salah (harus ada @).");
        }

        // 3. Validasi Telepon
        if (telepon == null || telepon.trim().isEmpty()) {
            throw new Exception("Telepon wajib diisi!");
        }
        // Cek apakah isinya angka semua (Regex 0-9)
        if (!telepon.matches("[0-9]+")) {
            throw new Exception("Telepon harus berupa angka!");
        }
        // Cek panjang minimal
        if (telepon.length() < 10) {
            throw new Exception("Telepon minimal 10 digit!");
        }
    }
}