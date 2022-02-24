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
public class Diem {
    private int x;
    private int y;

    public Diem() {
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Diem{" + "x=" + x + ", y=" + y + '}';
    }
    
    public static Diem addDiem(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("X: ");
        int x = s.nextInt();
        
        System.out.println("Y: ");
        int y = s.nextInt();
        
        Diem d = new Diem(x, y);
        
        return d;
    }
    
   
}
