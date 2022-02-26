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
public class SinhVien {
    private String maSV;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, String ngaySinh, String gioiTinh, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return  maSV + "$" + ten + "$" + ngaySinh + "$" + gioiTinh + "$" + diemTB + '$';
    }
    
    
}
