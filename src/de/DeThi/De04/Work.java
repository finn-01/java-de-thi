/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DeThi.De04;

/**
 *
 * @author Finn
 */
public class Work {
    private int id;
    private String en;
    private String vn;

    public Work() {
    }

    public Work(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    @Override
    public String toString() {
        return  id + "$" + en + "$" + vn;
    }
    
    
}
