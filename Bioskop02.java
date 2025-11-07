import java.util.Scanner;

public class Bioskop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int HARGA_TIKET = 50000;
        int totalTiket = 0;
        double totalPendapatan = 0;

        System.out.println("=== MENGHITUNG TOTAL PENJUALAN TIKET BIOSKOP SELAMA 1 HARI ===");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.\n");
                continue;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85; 
                System.out.println("Diskon 15% ");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; 
                System.out.println("Diskon 10% ");
            }

            System.out.println("Total harga untuk pelanggan: Rp " + (int) totalHarga + "\n");

            totalTiket += jumlahTiket;
            totalPendapatan += totalHarga;


        } while (true);

        System.out.println("\n=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + (int) totalPendapatan);
        System.out.println("Terima kasih!");

        scanner.close();
    }
}
