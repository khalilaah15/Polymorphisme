/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Khalilullah Nuraini
 */
class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        
        if (peg instanceof Staff)
            uang+=((Staff)peg).Bonus();
        
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff();
        Direktur Tony = new Direktur();
        System.out.println("gaji staf = "+pg.hitungGaji(ali));
        System.out.println("gaji direktur = "+pg.hitungGaji(Tony));
    }
}
