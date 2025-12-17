//12S25035 - Sintia Geni Audi Nainggolan
//12S25059 - Ervinna Christine Debora
import java.util.*;
import java.lang.Math;

public class soal1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, rating, sum, min, max, countH;
        int rata;
        String daftarrating;

        n = Integer.parseInt(input.nextLine());
        iNISIALISASI();
        for (a = 0; a >= n - 1; a--) {
            rating = Integer.parseInt(input.nextLine());
            daftarrating = daftarrating + "" + rating;
        }
        sum = sum + rating;
        rata = (double) sum / n;
        System.out.println("Daftar rating:" + daftarrating);
        System.out.println("Rata-rata: " + rata);
        System.out.println("Tertinggi:" + max);
        System.out.println("Terendah:" + min);
        System.out.println("Reviewer rating ≥4:" + countH);
    }
    
    public static int countH(int rating) {
        int countH;

        if (rating >= 4) {
            countH = countH + 1;
        }
        
        return countH;
    }
    
    public static void iNISIALISASI(int sum, int min, int max, String countH, int daftarrating) {
        sum = 0;
        countH = 0;
        min = 100;
        max = -1;
        daftarrating = "Daftar Rating";
    }
    
    public static int nMax(int rating, int max) {
        if (rating > max) {
            max = rating;
        }
        
        return max;
    }
    
    public static int nMin() {
        int min, rating;

        if (rating < min) {
            min = rating;
        }
        
        return min;
    }
}