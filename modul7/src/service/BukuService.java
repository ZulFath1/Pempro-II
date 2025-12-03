package service;

import dao.BukuDao;
import dao.impl.BukuDaoImpl;
import model.Buku;
import java.util.List;

public class BukuService {
    private final BukuDao bukuDao = new BukuDaoImpl();
    
    public List<Buku> getAllBuku() {
        return bukuDao.getAllBuku();
    }

    public void addBuku(String judul, String penulis, String hargaStr, String stokStr) throws Exception {
        // Validasi
        validasiData(judul, penulis, hargaStr, stokStr);
        
        // Konversi ke angka
        int harga = Integer.parseInt(hargaStr);
        int stok = Integer.parseInt(stokStr);
        
        Buku buku = new Buku(judul, penulis, harga, stok);
        bukuDao.addBuku(buku);
    }

    public void updateBuku(Buku buku) throws Exception {
        // Validasi data objek
        validasiData(buku.getJudul(), buku.getPenulis(), String.valueOf(buku.getHarga()), String.valueOf(buku.getStok()));
        bukuDao.updateBuku(buku);
    }

    public void deleteBuku(int id) {
        bukuDao.deleteBuku(id);
    }

    private void validasiData(String judul, String penulis, String hargaStr, String stokStr) throws Exception {
        if (judul == null || judul.trim().isEmpty()) {
            throw new Exception("Judul buku wajib diisi!");
        }
        if (penulis == null || penulis.trim().isEmpty()) {
            throw new Exception("Penulis wajib diisi!");
        }
        
        if (hargaStr == null || !hargaStr.matches("[0-9]+")) {
            throw new Exception("Harga harus berupa angka!");
        }
        
        if (stokStr == null || !stokStr.matches("[0-9]+")) {
            throw new Exception("Stok harus berupa angka!");
        }
        
        if (Integer.parseInt(hargaStr) <= 0) {
            throw new Exception("Harga harus lebih dari 0!");
        }
    }
}