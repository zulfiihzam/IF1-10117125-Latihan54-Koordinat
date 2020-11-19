/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan54.koordinat;

/**
 *
 * @author Zulfi
 */
public class WarnaKoodinat extends Koordinat{
     public String namaWarna;

    public WarnaKoodinat(int x, int y) {
        super(x, y);
    }

    public WarnaKoodinat(int x, int y, String namaWarna) {
        super(x,y);
        setNamaWarna(namaWarna);
    }


    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}
