package dao;

import model.Pelanggan;
import java.util.List;

public interface PelangganDao {
    List<Pelanggan> getAllPelanggan();
    void addPelanggan(Pelanggan pelanggan);
    void updatePelanggan(Pelanggan pelanggan);
    void deletePelanggan(int id);
}