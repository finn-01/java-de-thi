/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.De06Number;

/**
 *
 * @author Finn
 */
public class Number {
    private int numA;
    private int numB;

    public Number() {
    }

    public Number(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    
    public int sum(){
        return numA + numB;
    }
    
    public int sub(){
        return numA - numB;
    }
    
    public int mul(){
        return numA * numB;
    }
    
    public double chia(){
        return numA / numB;
    }
    
    public int ucln(int a, int b){
        if(b == 0){
            return a;
        }
        return ucln(b, a % b);
    }

    @Override
    public String toString() {
        return "numA=" + numA + ", numB=" + numB + ", ";
    }
    
    
}
