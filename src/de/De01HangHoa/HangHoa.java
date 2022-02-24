/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.De01HangHoa;

/**
 *
 * @author Finn
 */
public class HangHoa {
    private String maHang;
    private String tenSP;
    private double gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenSP, double gia) {
        this.maHang = maHang;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenSP=" + tenSP + ", gia=" + gia + '}';
    }
    
    
}
