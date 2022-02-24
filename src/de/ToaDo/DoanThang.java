/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ToaDo;

import java.util.Scanner;

/**
 *
 * @author Finn
 */
public class DoanThang extends Diem{
    private Diem diemA;
    private Diem diemB;

    public DoanThang() {
    }

    public DoanThang(Diem diemA, Diem diemB) {
        this.diemA = diemA;
        this.diemB = diemB;
    }

    public DoanThang(Diem diemA, Diem diemB, int x, int y) {
        super(x, y);
        this.diemA = diemA;
        this.diemB = diemB;
    }

    public Diem getDiemA() {
        return new Diem(diemA.getX(), diemA.getY());
    }

    public void setDiemA(Diem diemA) {
        this.diemA = diemA;
    }

    public Diem getDiemB() {
        return new Diem(diemB.getX(), diemB.getY());
    }

    public void setDiemB(Diem diemB) {
        this.diemB = diemB;
    }

    @Override
    public String toString() {
        return "DoanThang{" + "diemA=" + diemA + ", diemB=" + diemB + '}';
    }

    

    public static DoanThang add(){
        Scanner s = new Scanner(System.in);
        System.out.println("Diem thu nhat: ");
        Diem a = addDiem();
        
        System.out.println("Diem thu 2: ");
        Diem b = addDiem();
        
        DoanThang d = new DoanThang(a, b);
        System.out.println(d.toString());
        return d;
    }
    
     public double chieuDai(Diem diemA, Diem diemB){
         double a = (diemB.getX() - diemA.getX());
         double b = (diemB.getY() - diemB.getY());
         
         return Math.sqrt(a * a + b * b);
     }
}
