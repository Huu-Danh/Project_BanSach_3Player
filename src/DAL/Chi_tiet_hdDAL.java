/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import DTO.Chi_tiet_hd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Huu Danh
 */
public class Chi_tiet_hdDAL {

    public Chi_tiet_hdDAL() {
    }
    
     public boolean insertChitiethoadon(Chi_tiet_hd cthd) {
        Connection con = null;
        PreparedStatement statement = null;
         con = Connect.Connect();
        String sql = "INSERT INTO `chi_tiet_hd`(`maSach`, `maHD`, `soluong`) VALUES (?,?,?)";
        try  {
           statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cthd.getSach().getMaSach());
            statement.setInt(2, cthd.getHoaDon().getMaHD());
            statement.setInt(3, cthd.getSoLuong());
            int affectedRows = statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
     
     
}
