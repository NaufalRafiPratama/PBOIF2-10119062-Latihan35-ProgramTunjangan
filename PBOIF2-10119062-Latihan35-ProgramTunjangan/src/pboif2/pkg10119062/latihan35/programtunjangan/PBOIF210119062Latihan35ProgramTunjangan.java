/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan35.programtunjangan;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : program ini berisi program untuk menampilkan
 * program tunjangan
 */
public class PBOIF210119062Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tunjangan gaji = new Tunjangan();
        gaji.inputData();
        gaji.cekStatus();
        gaji.tampilFormat();
    }
    
}
