/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ToaDo;

import static de.ToaDo.DoanThang.add;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Finn
 */
public class MainToaDo {
    public static void main(String[] args) {
        ArrayList<DoanThang> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        Scanner s = new Scanner(System.in);
    
        String chon;
        
        
        while(true){
            menu();
            chon = s.nextLine();
            int op = Integer.parseInt(chon);
            
            switch(op){
                case 1:
                    System.out.println("Them");
                    DoanThang d = add();
                    
                    list1.add(d.chieuDai(d.getDiemA(), d.getDiemB()));
                    System.out.println(list1);
                    
                    list.add(d);
                    System.out.println("Thanh cong");
                    break;
                case 2:
                    System.out.println("Danh sach diem: ");
                    for(DoanThang x: list){
                        System.out.println(x.toString() + ',');
                    }
                    break;
                case 3: 
                    System.out.println("Do dai gan nhat la: ");
                    System.out.println("Min: " + Collections.min(list1));
                    break;
                case 4:
                    System.out.println("Tong la: ");
                    double sum = 0;
                    for(Double x: list1){
                        sum +=x;
                      
                    }
                    System.out.println(sum);
                    break;
                case 5:
                    System.out.println("Tam biet");
                    System.exit(0);
                    
                default:
                    System.out.println("Nhap 1 -> 5!");
                    break;
            }
        }
        
        
    }
    
    static void menu()
    {
        System.out.println("\t\tMENU");
        System.out.println("\t1. Them diem moi");
        System.out.println("\t2. In diem");
        System.out.println("\t3. Doan thang ngan nhat");
        System.out.println("\t4. Tinh tong doan thang da nhap");
        System.out.println("\t5. Exit");
        
    }
  
}
