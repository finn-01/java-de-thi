/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.DeThi.De04;

import java.util.ArrayList;

/**
 *
 * @author Finn
 */
public class Dictionary {
    ArrayList<Work> list = new ArrayList<>();

    public Dictionary() {
        list.add(new Work(1, "Apple", "Qua tao"));
        list.add(new Work(2, "Mouse", "Chuot"));
        list.add(new Work(3, "Keyboard", "Ban phim"));
        list.add(new Work(4, "Monitor", "Man hinh"));
        list.add(new Work(4, "Computer", "May tinh"));
        list.add(new Work(5, "Pen", "But"));
        list.add(new Work(6, "Sunday", "Chu nhat"));
        list.add(new Work(7, "One", "So mot"));
        list.add(new Work(8, "Book", "Quyen vo"));
        list.add(new Work(9, "Bottle", "Chai"));
        list.add(new Work(10, "Chair", "Cai ghe"));
    }
    
    public  void add(Work w){
        list.add(w);
    }

    @Override
    public String toString() {
        String str = "";
        for(Work x: list){
            str += x.toString();
            str += "\n";
        }
        return str;
    }
    
    public String findEn(String vn){
        for(Work x: list){
            if(vn.equalsIgnoreCase(x.getVn())){
                return x.getEn();
            }
        }
        return null;
    }
    
    public String findVn(String en){
        for(Work x: list){
            if(en.equalsIgnoreCase(x.getEn())){
                return x.getVn();
            }
        }
        return null;
    }
    
}
