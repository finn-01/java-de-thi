/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DeThi.De03;

/**
 *
 * @author Finn
 */
public class SinhVienATTT extends SinhVien{
    private String hocPhi;

    public SinhVienATTT() {
    }

    public SinhVienATTT(String hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienATTT(String hocPhi, String maSV, String ten, String ngaySinh, String gioiTinh, double diemTB) {
        super(maSV, ten, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    public String getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(String hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + hocPhi;
    }
    
    
}
