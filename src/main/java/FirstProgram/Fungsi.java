package FirstProgram;

import FirstProgram.NamaKu;
import Contoh.hasil;

public class Fungsi {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int z = 10;
        int v = 25;

        NamaKu.Indah("Rizky");
        NamaKu.Indah("Ramdan");
        hasil.printNama(" ini beda index ");
        hasil.printNama(" ini GIT Add ");

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        tambah(z,v);

    }
    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah : " +hasilTambah);
        return hasilTambah;
    }


}
