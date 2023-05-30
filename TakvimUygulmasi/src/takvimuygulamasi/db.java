package takvimuygulamasi;

import java.sql.*;
import javax.swing.JOptionPane;

// veritabanı bağlantısı için ayrı bir class açıldı ve kod tekrarı engellendi.
class db {

    public static Connection connect_db() {
        // VERİ TABANI BAĞLANTISI

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\NetBeansProjects\\TakvimUygulmasi"
                    + "\\TakvimUygulamasi.sqlite");
            return conn;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}
