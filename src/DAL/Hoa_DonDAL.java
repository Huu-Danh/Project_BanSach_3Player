/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.Chi_tiet_hd;
import DTO.Hoa_don;
import DTO.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Huu Danh
 */
public class Hoa_DonDAL {

    public Hoa_DonDAL() {
    }

    public boolean insertHoaDon(Hoa_don hoaDon) throws SQLException {
        Connection con = null;
        PreparedStatement statement = null;
        boolean insertSuccessful = false; // Biến để theo dõi trạng thái chèn dữ liệu

        try {
            con = Connect.Connect();
            String sql = "INSERT INTO `hoa_don`(`maHD`,`maTT`, `ngayBanSach`) VALUES (?,?,?)";
            statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, hoaDon.getMaHD());
            statement.setInt(2, hoaDon.getThuThu().getMaTT());
            statement.setString(3, hoaDon.getNgayBanSach());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                insertSuccessful = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Throw the exception to be handled by the calling method
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return insertSuccessful; // Trả về kết quả chèn dữ liệu
    }

    public boolean insertHoadonWithDetails(Hoa_don hoadon, ArrayList<Chi_tiet_hd> cthds) throws SQLException {
        boolean success = insertHoaDon(hoadon);
        Chi_tiet_hdDAL cthdDAL = new Chi_tiet_hdDAL();
        if (success) {
            for (Chi_tiet_hd cthd : cthds) {
                boolean detailSuccess = cthdDAL.insertChitiethoadon(cthd);
                if (!detailSuccess) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public ArrayList<Chi_tiet_hd> selectChiTietHoaDon(int maHD) throws SQLException {
        ArrayList<Chi_tiet_hd> cthds = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            con = Connect.Connect();
            String sql = "SELECT cthd.maCTHD, cthd.maHD, cthd.maSach, s.tenSach , cthd.soluong, s.gia, hd.ngayBanSach\n"
                    + "FROM chi_tiet_hd cthd \n"
                    + "JOIN hoa_don hd ON cthd.maHD = hd.maHD \n"
                    + "JOIN sach s ON cthd.maSach = s.maSach \n"
                    + "WHERE hd.maHD = ?;";
            statement = con.prepareStatement(sql);
            statement.setInt(1, maHD);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Chi_tiet_hd cthd = new Chi_tiet_hd();
                cthd.setMaCTHD(resultSet.getInt("maCTHD"));
                Hoa_don hoaDon = new Hoa_don();
                hoaDon.setMaHD(resultSet.getInt("maHD"));
                hoaDon.setNgayBanSach(resultSet.getString("ngayBanSach"));
                cthd.setHoaDon(hoaDon);
                Sach sach = new Sach();
                sach.setMaSach(resultSet.getInt("maSach"));
                sach.setTenSach(resultSet.getString("tenSach"));
                sach.setGia((double)resultSet.getInt("gia"));
                cthd.setSach(sach);
                cthd.setSoLuong(resultSet.getInt("soluong"));
                cthds.add(cthd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return cthds;
    }
}
