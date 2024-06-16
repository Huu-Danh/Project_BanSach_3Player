/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SachDAL;
import DTO.Sach;

/**
 *
 * @author Huu Danh
 */
public class SachBLL {
    SachDAL sachDAL = new SachDAL();
    
    public SachBLL() {
    }
    
    public Sach getSach(int maSach){
        Sach sach = new Sach();
        sach = sachDAL.selectSach(maSach);
        return sach;
    } 
}
