package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Pelanggan;
import model.Buku;
import model.Penjualan;
import service.PelangganService;
import service.BukuService;
import service.PenjualanService;

public class MainController {

    // --- TAB PELANGGAN ---
    @FXML private TextField txtNama, txtEmail, txtTelepon;
    @FXML private TableView<Pelanggan> tblPelanggan;
    @FXML private TableColumn<Pelanggan, String> colNama, colEmail, colTelepon;
    
    // --- TAB BUKU ---
    @FXML private TextField txtJudul, txtPenulis, txtHarga, txtStok;
    @FXML private TableView<Buku> tblBuku;
    @FXML private TableColumn<Buku, String> colJudul, colPenulis;
    @FXML private TableColumn<Buku, Integer> colHarga, colStok;

    // --- TAB PENJUALAN ---
    @FXML private ComboBox<Pelanggan> comboPelanggan;
    @FXML private ComboBox<Buku> comboBuku;
    @FXML private TextField txtJumlah;
    @FXML private TableView<Penjualan> tblPenjualan;
    @FXML private TableColumn<Penjualan, String> colTanggal;
    @FXML private TableColumn<Penjualan, Integer> colJumlah, colTotal, colPelangganId, colBukuId;

    // --- SERVICES ---
    private final PelangganService pelangganService = new PelangganService();
    private final BukuService bukuService = new BukuService();
    private final PenjualanService penjualanService = new PenjualanService();

    // --- VARIABEL BANTUAN ---
    private Pelanggan selectedPelanggan;
    private Buku selectedBuku;
    private Penjualan selectedPenjualan;

    @FXML
    public void initialize() {
        initPelanggan();
        initBuku();
        initPenjualan();
    }

    //Logic Pelanggan
    private void initPelanggan() {
        colNama.setCellValueFactory(c -> c.getValue().namaProperty());
        colEmail.setCellValueFactory(c -> c.getValue().emailProperty());
        colTelepon.setCellValueFactory(c -> c.getValue().teleponProperty());

        loadPelanggan();

        tblPelanggan.getSelectionModel().selectedItemProperty().addListener((obs, old, newVal) -> {
            if (newVal != null) {
                selectedPelanggan = newVal;
                txtNama.setText(newVal.getNama());
                txtEmail.setText(newVal.getEmail());
                txtTelepon.setText(newVal.getTelepon());
            }
        });
    }

    private void loadPelanggan() {
        ObservableList<Pelanggan> list = FXCollections.observableArrayList(pelangganService.getAllPelanggan());
        tblPelanggan.setItems(list);
        comboPelanggan.setItems(list);
    }

    @FXML private void onAddPelanggan() {
        try {
            pelangganService.addPelanggan(txtNama.getText(), txtEmail.getText(), txtTelepon.getText());
            showAlert(Alert.AlertType.INFORMATION, "Sukses", "Pelanggan Ditambahkan");
            clearPelanggan();
            loadPelanggan();
        } catch (Exception e) { showAlert(Alert.AlertType.ERROR, "Gagal", e.getMessage()); }
    }

    @FXML private void onEditPelanggan() {
        if (selectedPelanggan == null) return;
        try {
            selectedPelanggan.setNama(txtNama.getText());
            selectedPelanggan.setEmail(txtEmail.getText());
            selectedPelanggan.setTelepon(txtTelepon.getText());
            pelangganService.updatePelanggan(selectedPelanggan);
            showAlert(Alert.AlertType.INFORMATION, "Sukses", "Pelanggan Diupdate");
            clearPelanggan();
            loadPelanggan();
        } catch (Exception e) { showAlert(Alert.AlertType.ERROR, "Gagal", e.getMessage()); }
    }

    @FXML private void onDeletePelanggan() {
        if (selectedPelanggan == null) return;
        pelangganService.deletePelanggan(selectedPelanggan.getPelangganId());
        showAlert(Alert.AlertType.INFORMATION, "Sukses", "Pelanggan Dihapus");
        clearPelanggan();
        loadPelanggan();
    }

    private void clearPelanggan() {
        txtNama.clear(); txtEmail.clear(); txtTelepon.clear();
        selectedPelanggan = null;
    }


    // Logic Buku
    private void initBuku() {
        colJudul.setCellValueFactory(c -> c.getValue().judulProperty());
        colPenulis.setCellValueFactory(c -> c.getValue().penulisProperty());
        colHarga.setCellValueFactory(c -> c.getValue().hargaProperty().asObject());
        colStok.setCellValueFactory(c -> c.getValue().stokProperty().asObject());

        loadBuku();

        tblBuku.getSelectionModel().selectedItemProperty().addListener((obs, old, newVal) -> {
            if (newVal != null) {
                selectedBuku = newVal;
                txtJudul.setText(newVal.getJudul());
                txtPenulis.setText(newVal.getPenulis());
                txtHarga.setText(String.valueOf(newVal.getHarga()));
                txtStok.setText(String.valueOf(newVal.getStok()));
            }
        });
    }

    private void loadBuku() {
        ObservableList<Buku> list = FXCollections.observableArrayList(bukuService.getAllBuku());
        tblBuku.setItems(list);
        comboBuku.setItems(list);
    }

    @FXML private void onAddBuku() {
        try {
            bukuService.addBuku(txtJudul.getText(), txtPenulis.getText(), txtHarga.getText(), txtStok.getText());
            showAlert(Alert.AlertType.INFORMATION, "Sukses", "Buku Ditambahkan");
            clearBuku();
            loadBuku();
        } catch (Exception e) { showAlert(Alert.AlertType.ERROR, "Gagal", e.getMessage()); }
    }

    @FXML private void onEditBuku() {
        if (selectedBuku == null) return;
        try {
            selectedBuku.setJudul(txtJudul.getText());
            selectedBuku.setPenulis(txtPenulis.getText());
            selectedBuku.setHarga(Integer.parseInt(txtHarga.getText()));
            selectedBuku.setStok(Integer.parseInt(txtStok.getText()));
            bukuService.updateBuku(selectedBuku);
            showAlert(Alert.AlertType.INFORMATION, "Sukses", "Buku Diupdate");
            clearBuku();
            loadBuku();
        } catch (Exception e) { showAlert(Alert.AlertType.ERROR, "Gagal", e.getMessage()); }
    }

    @FXML private void onDeleteBuku() {
        if (selectedBuku == null) return;
        bukuService.deleteBuku(selectedBuku.getBukuId());
        showAlert(Alert.AlertType.INFORMATION, "Sukses", "Buku Dihapus");
        clearBuku();
        loadBuku();
    }

    private void clearBuku() {
        txtJudul.clear(); txtPenulis.clear(); txtHarga.clear(); txtStok.clear();
        selectedBuku = null;
    }


    // Logic Penjualan
    private void initPenjualan() {
        colTanggal.setCellValueFactory(c -> c.getValue().tanggalProperty());
        colJumlah.setCellValueFactory(c -> c.getValue().jumlahProperty().asObject());
        colTotal.setCellValueFactory(c -> c.getValue().totalHargaProperty().asObject());
        colPelangganId.setCellValueFactory(c -> c.getValue().pelangganIdProperty().asObject());
        colBukuId.setCellValueFactory(c -> c.getValue().bukuIdProperty().asObject());

        loadPenjualan();
        
        tblPenjualan.getSelectionModel().selectedItemProperty().addListener((obs, old, newVal) -> {
            if (newVal != null) selectedPenjualan = newVal;
        });
    }

    private void loadPenjualan() {
        tblPenjualan.setItems(FXCollections.observableArrayList(penjualanService.getAllPenjualan()));
    }

    @FXML private void onAddPenjualan() {
        Pelanggan p = comboPelanggan.getValue();
        Buku b = comboBuku.getValue();
        
        if (p == null || b == null) {
            showAlert(Alert.AlertType.WARNING, "Warning", "Pilih Pelanggan dan Buku dulu!");
            return;
        }

        try {
            penjualanService.addPenjualan(p.getPelangganId(), b.getBukuId(), txtJumlah.getText());
            showAlert(Alert.AlertType.INFORMATION, "Sukses", "Transaksi Berhasil!");
            txtJumlah.clear();
            loadPenjualan();
        } catch (Exception e) { showAlert(Alert.AlertType.ERROR, "Gagal", e.getMessage()); }
    }

    @FXML private void onDeletePenjualan() {
        if (selectedPenjualan == null) return;
        penjualanService.deletePenjualan(selectedPenjualan.getPenjualanId());
        showAlert(Alert.AlertType.INFORMATION, "Sukses", "Transaksi Dihapus");
        loadPenjualan();
    }

    private void showAlert(Alert.AlertType type, String title, String msg) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}