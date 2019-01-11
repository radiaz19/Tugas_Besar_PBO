/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author TRIASNO
 */
public class Koneksi {
        Connection Koneksi;
    public Connection getConnection(){
        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/makanan","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database GAGAl", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return Koneksi;
    }
}


