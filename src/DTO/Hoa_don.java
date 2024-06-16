/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Huu Danh
 */
public class Hoa_don {
    int maHD;
    Thu_thu thuThu;
    double tongThanhTien;
    String ngayBanSach;

    public Hoa_don() {
    }

    public Hoa_don(int maHD, Thu_thu thuThu, double tongThanhTien, String ngayBanSach) {
        this.maHD = maHD;
        this.thuThu = thuThu;
        this.tongThanhTien = tongThanhTien;
        this.ngayBanSach = ngayBanSach;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Thu_thu getThuThu() {
        return thuThu;
    }

    public void setThuThu(Thu_thu thuThu) {
        this.thuThu = thuThu;
    }

    public double getTongThanhTien() {
        return tongThanhTien;
    }

    public void setTongThanhTien(double tongThanhTien) {
        this.tongThanhTien = tongThanhTien;
    }

    public String getNgayBanSach() {
        return ngayBanSach;
    }

    public void setNgayBanSach(String ngayBanSach) {
        this.ngayBanSach = ngayBanSach;
    }
    
    
}
