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
public class DienThoai extends HangHoa{
    private String nhaSX;
    private String dungLuong;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSX, String dungLuong, String mauSac) {
        this.nhaSX = nhaSX;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public DienThoai(String nhaSX, String dungLuong, String mauSac, String maHang, String tenSP, double gia) {
        super(maHang, tenSP, gia);
        this.nhaSX = nhaSX;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "DienThoai{" + "nhaSX=" + nhaSX + ", dungLuong=" + dungLuong + ", mauSac=" + mauSac + ", " + super.toString() + '}';
    }
    
    
}
