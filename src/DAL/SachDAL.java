/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import DTO.Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huu Danh
 */
public class SachDAL {

    ResultSet rs = null;
    Statement st = null;

    public SachDAL() {
    }
    
    public Sach selectSach(int maSach) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = Connect.Connect();
            Sach sachinfo = new Sach();
            String sql = "SELECT * FROM `sach` WHERE `maSach` = " + maSach;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            if (rs.next()) {
                sachinfo.setMaSach(maSach);
                sachinfo.setTheLoai(rs.getString("theLoai"));
                sachinfo.setTenSach(rs.getString("tenSach"));
                sachinfo.setGia(rs.getDouble("gia"));  // Nếu giá là kiểu double
                sachinfo.setNhaXB(rs.getString("nhaXB"));
                sachinfo.setNamXB(rs.getInt("namXB"));
                sachinfo.setTacGia(rs.getString("tacGia"));
            }

            return sachinfo;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            // Đóng các tài nguyên
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                Logger.getLogger(SachDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
