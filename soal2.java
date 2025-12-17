//12S25035 - Sintia Geni Audi Nainggolan
//12S25059 - Ervinna Christine Debora

import java.util.*;
import java.lang.Math;

public class soal2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahbarang, c, barang;

        jumlahbarang = input.nextInt();
        int[] stok = new int[jumlahbarang], terjual = new int[jumlahbarang];
        String[] nama = new String[jumlahbarang];

        for (c = 0; c <= jumlahbarang; c++) {
            nama[c] = input.nextLine();
            stok[c] = input.nextInt();
            terjual[c] = input.nextInt();
        }
    }
    
    public static int stokvalid() {
        int stok;

        stok = -1;
        while (stok < 0) {
            System.out.println("masukkan stok awal (>=0):");
            stok = input.nextInt();
            if ("") {
            }
        }
        
        return ;
    }
}
