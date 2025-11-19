package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import Model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {

    // menyambung komponen di FXML lawan kodingan Java
    @FXML
    private TableView<Mahasiswa> tabelMahasiswa;
    
    @FXML
    private TableColumn<Mahasiswa, String> nimCol;
    
    @FXML
    private TableColumn<Mahasiswa, String> namaCol;
    
    @FXML
    private TableColumn<Mahasiswa, String> hobiCol;
    
    @FXML
    private TableColumn<Mahasiswa, String> makananCol;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //menyambung kolom lawan atribut di Model Mahasiswa
        nimCol.setCellValueFactory(new PropertyValueFactory<>("nim"));
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));
        hobiCol.setCellValueFactory(new PropertyValueFactory<>("hobi"));
        makananCol.setCellValueFactory(new PropertyValueFactory<>("makananFavorit"));

        //masuki data ke tabel
        tabelMahasiswa.setItems(getMahasiswaList());
    }

    // Data fake fake tepu
    public ObservableList<Mahasiswa> getMahasiswaList() {
        ObservableList<Mahasiswa> list = FXCollections.observableArrayList();
        list.add(new Mahasiswa(1, "221001", "Nafis", "Tidur", "Nasi Goreng"));
        list.add(new Mahasiswa(2, "221002", "Faqih", "Futsal", "Ayam Geprek"));
        list.add(new Mahasiswa(3, "221003", "Azriel", "Coding", "Mie Instan"));
        list.add(new Mahasiswa(4, "221004", "Amay Ganteng", "Ngaca", "Sate Ayam"));
        list.add(new Mahasiswa(5, "221005", "Rakha", "Main Game", "Bakso"));
        list.add(new Mahasiswa(6, "221006", "Ulyani", "Membaca", "Seblak"));
        list.add(new Mahasiswa(7, "221007", "Daniel", "Berenang", "Pizza"));
        list.add(new Mahasiswa(8, "221008", "Ibnu", "Musik", "Burger"));
        list.add(new Mahasiswa(9, "221009", "Ghazi", "Jogging", "Steak"));
        list.add(new Mahasiswa(10, "221010", "Alfi", "Melukis", "Soto"));
        return list;
    }
}