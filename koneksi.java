/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class koneksi {
    private static Connection koneksi_db=null;
    public static Connection ambilKoneksiDatabase(){
        MysqlDataSource dbbarang=new MysqlDataSource();
        dbbarang.setDatabaseName("inventory");
        dbbarang.setPassword("");
        dbbarang.setUser("root");
        try{
            koneksi_db=dbbarang.getConnection();
            System.out.println("Koneksi Berhasil");
            
            }
        catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
                    }
        return koneksi_db;
        }
}
