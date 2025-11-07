import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = scanner.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Masukkan jumlah kopi: ");
            kopi = scanner.nextInt();

            System.out.print("Masukkan jumlah teh: ");
            teh = scanner.nextInt();

            System.out.print("Masukkan jumlah roti: ");
            roti = scanner.nextInt();

            int totalHarga = (kopi * 12000) + (teh * 7000) + (roti * 20000);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah: Rp " + totalHarga);

            scanner.nextLine(); 

        } while (true);

        System.out.println("Transaksi selesai.");
        scanner.close();
    }
}
