import java.util.Scanner;
public class SiakadFor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus  = 0, tidakLulus = 0;
        int bataslulus = 60;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= bataslulus) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        
    
        scanner.close();
    }
}   