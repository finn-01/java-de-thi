/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DeThi.De01;

/**
 *
 * @author Finn
 */
public class Student extends Person{
    private String maSV;
    private String email;
    private double diemTongKet;

    public Student() {
    }

    public Student(String maSV, String email, double diemTongKet) {
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public Student(String maSV, String email, double diemTongKet, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public String toString() {
        return super.toString() + ", maSV=" + maSV + ", email=" + email + ", diemTongKet=" + diemTongKet + '}';
    }
}
