/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan54.koordinat;

/**
 *Nama  : Zulfi Ihzam Rahmat
 *Kelas : IF-1
 *NIM   : 10117125
 *Deskripsi Program : program ini berisi program koordinat
 */
public class IF110117125Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoodinat warnaKoordinat = new WarnaKoodinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warnaKoordinat.getX()+", y : "+warnaKoordinat.getY());
    }
    
}
