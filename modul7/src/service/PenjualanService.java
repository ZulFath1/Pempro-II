package service;

import dao.PenjualanDao;
import dao.impl.PenjualanDaoImpl;
import model.Penjualan;
import model.Buku;
import dao.BukuDao;
import dao.impl.BukuDaoImpl;
import java.util.List;
import java.time.LocalDate;

public class PenjualanService {
    private final PenjualanDao penjualanDao = new PenjualanDaoImpl();
    private final BukuDao bukuDao = new BukuDaoImpl(); 

    public List<Penjualan> getAllPenjualan() {
        return penjualanDao.getAllPenjualan();
    }

    public void addPenjualan(int pelangganId, int bukuId, String jumlahStr) throws Exception {
        if (jumlahStr == null || !jumlahStr.matches("[0-9]+")) {
            throw new Exception("Jumlah harus berupa angka!");
        }
        
        int jumlah = Integer.parseInt(jumlahStr);
        if (jumlah <= 0) {
            throw new Exception("Jumlah harus lebih dari 0!");
        }

        int hargaBuku = 0;
        int stokBuku = 0;
        
        List<Buku> semuaBuku = bukuDao.getAllBuku();
        boolean bukuDitemukan = false;
        
        for(Buku b : semuaBuku) {
            if(b.getBukuId() == bukuId) {
                hargaBuku = b.getHarga();
                stokBuku = b.getStok();
                bukuDitemukan = true;
                break;
            }
        }

        if(!bukuDitemukan) throw new Exception("Buku tidak ditemukan!");
        if(stokBuku < jumlah) throw new Exception("Stok buku tidak cukup!");

        int totalHarga = hargaBuku * jumlah;
        String tanggalSekarang = LocalDate.now().toString(); 

        Penjualan penjualan = new Penjualan(jumlah, totalHarga, tanggalSekarang, pelangganId, bukuId);
        penjualanDao.addPenjualan(penjualan);
    }

    public void deletePenjualan(int id) {
        penjualanDao.deletePenjualan(id);
    }
}