/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Huu Danh
 */
public class Thu_thu {
    int maTT, namSinh;
    String tenTT,gioTinh;

    public Thu_thu() {
    }

    public Thu_thu(int maTT, String tenTT, String gioTinh, int namSinh) {
        this.maTT = maTT;
        this.namSinh = namSinh;
        this.tenTT = tenTT;
        this.gioTinh = gioTinh;
    }

    public int getMaTT() {
        return maTT;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTenTT() {
        return tenTT;
    }

    public void setTenTT(String tenTT) {
        this.tenTT = tenTT;
    }

    public String getGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(String gioTinh) {
        this.gioTinh = gioTinh;
    }
    
}
