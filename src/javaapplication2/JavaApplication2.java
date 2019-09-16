/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author gema antika hariadi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = 3;
        int number2 = 5;
        Scanner isi = new Scanner(System.in);
  
        
        System.out.println("Masukkan bilangan");
        int bilangan1 = isi.nextInt();
        
        System.out.println("masukkan nama ");
        String nama = isi.next();
//        System.out.println("number 1 = "+(number1+number2));
        
        Mahasiswa mhs1 = new Mahasiswa("1900xxxx","enok");
        mhs1.biodata();
        
        Mahasiswa mhs2 = new Mahasiswa("1800xxxx","bambang");
        mhs2.biodata();
        
        
    }
    
}
