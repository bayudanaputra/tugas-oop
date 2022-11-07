/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas_opp;
import java.util.Scanner;

/**
 *
 * @author 21102069
 */
public class Tugas_opp {

    public static void main(String[] args) {
        dosen DSN = new dosen();
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("masukkan id dosen : ");
        String ID = dtIN.nextLine();
        DSN.Setiddos(ID);
        
        System.out.print("masukkan nama : ");
        String NM = dtIN.nextLine();
        DSN.Setnama(NM);
        
        System.out.print("alamat dosen : ");
        String ALMT = dtIN.nextLine();
        DSN.Setalamat(ALMT);
        
        System.out.print("matakuliah : ");
        String MK = dtIN.nextLine();
        DSN.Setmatkul(MK);
        
        System.out.print("hari : ");
        String HR = dtIN.nextLine();
        DSN.Sethari(HR);
        
        System.out.println("id dosen : " + ID);
        System.out.println("nama pengajar : " + NM);
        System.out.println("alamat : " + ALMT);
        System.out.println("matakuliah yang di ajarkan : " + MK);
        System.out.println("pada hari : " + HR);
        
    }
}
