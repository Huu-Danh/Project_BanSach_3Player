/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Huu Danh
 */
public class Chi_tiet_hd {
    int maCTHD, soLuong;
    Sach sach;
    Hoa_don hoaDon;
    double tongTien;

    public Chi_tiet_hd() {
    }

    public Chi_tiet_hd( int soLuong, Sach sach, double tongTien) {
        this.soLuong = soLuong;
        this.sach = sach;
        this.tongTien = tongTien;
    }

    public Chi_tiet_hd(int soLuong, Sach sach, Hoa_don hoaDon, double tongTien) {
        this.soLuong = soLuong;
        this.sach = sach;
        this.hoaDon = hoaDon;
        this.tongTien = tongTien;
    }
    
    

    
    public Chi_tiet_hd(int maCTHD, Sach sach, Hoa_don hoaDon, int soLuong, double tongTien) {
        this.maCTHD = maCTHD;
        this.soLuong = soLuong;
        this.sach = sach;
        this.hoaDon = hoaDon;
        this.tongTien = tongTien;
    }

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public Hoa_don getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(Hoa_don hoaDon) {
        this.hoaDon = hoaDon;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
}
