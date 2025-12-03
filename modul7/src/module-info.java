module modul7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;      // Izin untuk MySQL/JDBC
    requires javafx.base;
    requires javafx.graphics;
    
    opens application to javafx.graphics, javafx.fxml;
    opens controller to javafx.fxml;
    opens model to javafx.base; // Penting agar Tabel bisa baca data Pelanggan
    
    exports application;
}