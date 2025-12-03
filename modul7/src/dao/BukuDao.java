package dao;

import model.Buku;
import java.util.List;

public interface BukuDao {
    List<Buku> getAllBuku();
    void addBuku(Buku buku);
    void updateBuku(Buku buku);
    void deleteBuku(int id);
}