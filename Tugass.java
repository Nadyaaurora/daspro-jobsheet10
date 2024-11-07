import java.util.Scanner;

public class Tugass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[10][6];
        double[] rataResponden = new double[10];
        double[] rataPertanyaan = new double[6];
        int jumlahPertanyaan, jumlahRespon, jumlahSeluruh = 0;

        for (int i = 0; i < a.length; i++) {
            jumlahPertanyaan = 0;
            for (int j = 0; j < a[0].length; ) { // Mengatur loop tanpa `j++` di sini
                System.out.print("Masukkan nilai untuk a[" + i + "][" + j + "] (1-5): ");
                a[i][j] = scanner.nextInt(); // Menyimpan nilai langsung di `a[i][j]`
                
                // Memeriksa apakah nilai berada dalam rentang yang diizinkan
                if (a[i][j] >= 1 && a[i][j] <= 5) { 
                    jumlahPertanyaan += a[i][j]; // Menambahkan ke total jika valid
                    j++; // Beralih ke kolom berikutnya hanya jika input valid
                } else {
                    System.out.println("Nilai tidak valid. Silakan masukkan lagi.");
                }
            }
            rataResponden[i] = (double) jumlahPertanyaan / a[0].length;
            System.out.println("Rata-rata responden " + (i + 1) + ": " + rataResponden[i]);
        }

        // Menghitung rata-rata untuk setiap pertanyaan
        for (int j = 0; j < a[0].length; j++) {
            jumlahRespon = 0;
            for (int i = 0; i < a.length; i++) {
                jumlahRespon += a[i][j];
            }
            rataPertanyaan[j] = (double) jumlahRespon / a.length;
            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " + rataPertanyaan[j]);
        }

        // Menghitung rata-rata keseluruhan
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                jumlahSeluruh += a[i][j];
            }
        }
        double rataSeluruh = (double) jumlahSeluruh / (a.length * a[0].length);
        System.out.println("Rata-rata seluruh: " + rataSeluruh);
    }
}
