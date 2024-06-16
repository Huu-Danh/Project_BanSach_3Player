/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.Hoa_DonDAL;
import DTO.Chi_tiet_hd;
import DTO.Hoa_don;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huu Danh
 */
public class Hoa_DonBLL {

    public Hoa_DonBLL() {
    }

//    public boolean insertHD(Hoa_don hoaDon) {
//        Hoa_DonDAL hoaDonDAL = new Hoa_DonDAL();
//        try {
//            if (hoaDonDAL.insertHoaDon(hoaDon)) {
//                return true;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Hoa_DonBLL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
    public boolean insethd(Hoa_don hd, ArrayList<Chi_tiet_hd> cthds) {

        Hoa_DonDAL hoaDonDAL = new Hoa_DonDAL();
        try {
            if (hoaDonDAL.insertHoadonWithDetails(hd, cthds)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hoa_DonBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<Chi_tiet_hd> XuatHD(int maHD) {
        ArrayList<Chi_tiet_hd> cthds = new ArrayList<>();
        Hoa_DonDAL hoaDonDAL = new Hoa_DonDAL();
        try {
            cthds = hoaDonDAL.selectChiTietHoaDon(maHD);
            if (cthds.isEmpty() || cthds.size() < 0) {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Hoa_DonBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cthds;
    }
}
