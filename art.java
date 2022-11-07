/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aritmatika;

/**
 *
 * @author Acer
 */
public class art {
    private double hasil;
    
    private void tambah(double bil1, double bil2){
        this.hasil = bil1 + bil2;
    }
    private void kurang(double bil1, double bil2){
        this.hasil = bil1 - bil2;
    }
    public void kali(double bil1, double bil2){
        this.hasil = bil1 * bil2;
    }
    private void bagi(double bil1, double bil2){
        this.hasil = bil1 / bil2;
    }
    public double getHASIL(){
        return this.hasil;
    }
}
