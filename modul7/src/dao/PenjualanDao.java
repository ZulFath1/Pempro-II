package dao;

import model.Penjualan;
import java.util.List;

public interface PenjualanDao {
    List<Penjualan> getAllPenjualan();
    void addPenjualan(Penjualan penjualan);
    void deletePenjualan(int id);
}