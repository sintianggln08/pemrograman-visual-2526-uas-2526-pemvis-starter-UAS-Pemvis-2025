//12S25035 - Sintia Geni Audi Nainggolan
//12S25059 - Ervinna Christine Debora
import java.util.*;
import java.lang.Math;

public class soal5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b, n, countL, sum;
        String status, lolos;

        n = Integer.parseInt(input.nextLine());
        int[] pendapatan = new int[n];
        String[] nama = new String[n];
        int[] tanggunganKeluarga = new int[n];
        double[] iPK = new double[n];

        sum = 0;
        status = "";
        for (b = 0; b <= n - 1; b++) {
            nama[b] = input.nextLine();
            iPK[b] = Double.parseDouble(input.nextLine());
            pendapatan[b] = Integer.parseInt(input.nextLine());
            tanggunganKeluarga[b] = Integer.parseInt(input.nextLine());
            if (pendapatan[b] <= 3000000) {
                status = "Lolos";
                if (iPK[b] >= 3.0) {
                    status = "Lolos";
                    if (tanggunganKeluarga[b] >= 3) {
                        status = "Lolos";
                    } else {
                        status = "Tidak Lolos";
                    }
                } else {
                    status = "Tidak Lolos";
                }
            } else {
                status = "Tidak Lolos";
            }
            System.out.println(nama[b] + "-->" + status);
        }
    }
}
