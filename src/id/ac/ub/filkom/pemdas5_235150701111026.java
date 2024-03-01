package id.ac.ub.filkom;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class pemdas5_235150701111026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakBarang, total = 0;
        double diskon = 0, totalBayar, bayar, kembalian;
        String namaStaff, receiptNumber, orderID;

        LocalDate tanggal = LocalDate.now();
        LocalTime waktu = LocalTime.now();

        DateTimeFormatter tanggalFormat = DateTimeFormatter.ofPattern("d MMMM yyyy");
        DateTimeFormatter waktuFormat = DateTimeFormatter.ofPattern("HH.mm");

        String tanggalJadi = tanggal.format(tanggalFormat);
        String waktuJadi = waktu.format(waktuFormat);

        
        DecimalFormat angkaFormat = new DecimalFormat("#,###.###");

        // Input Nama Staff
        System.out.print("Staff : ");
        namaStaff = input.nextLine();

        // Input Jumlah Barang
        System.out.print("Jumlah barang : ");
        banyakBarang = input.nextInt();

        // Looping Input Nama Barang, Jumlah Pembelian, Harga Satuan Barang
        String[] namaBarang = new String[banyakBarang];
        int[] jumlahPembelian = new int[banyakBarang];
        int[] hargaSatuan = new int[banyakBarang];

        for (int i = 0; i < banyakBarang; i++) {
            input.nextLine(); // Clear Scanner Buffer
            System.out.print(" Barang ke-" + (i + 1) + ": ");
            namaBarang[i] = input.nextLine();
            System.out.print(" Banyak barang ke-" + (i + 1) + ": ");
            jumlahPembelian[i] = input.nextInt();
            System.out.print(" Harga Satuan Barang ke-" + (i + 1) + ": ");
            hargaSatuan[i] = input.nextInt();
            total += hargaSatuan[i] * jumlahPembelian[i];
        }

        // Generate Receipt Number dan Order ID Random
        receiptNumber = String.format("%6d", (int) (Math.random() * 999999));
        orderID = "FM" + String.format("%3d", (int) (Math.random() * 1000));

        // Hitung Diskon Berdasarkan Total Belanja
        diskon = hitungDiskon(total);

        // Hitung Total Bayar dan Kembalian
        totalBayar = total * (1 - diskon);
        bayar = inputNominalPembayaran();
        kembalian = bayar - totalBayar;

        // Output Struk Belanja
        outputStrukBelanja(tanggalJadi, waktuJadi, receiptNumber, orderID, namaStaff, namaBarang, jumlahPembelian, hargaSatuan, total, diskon, totalBayar, bayar, kembalian, angkaFormat);
    }

    public static double hitungDiskon(int total) {
        double diskon = 0;
        if (total >= 500000) {
            diskon = 0.2;
        } else if (total >= 100000) {
            diskon = 0.1;
        } else if (total >= 50000) {
            diskon = 0.05;
        }
        return diskon;
    }

    public static double inputNominalPembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nNominal Pembayaran = Rp ");
        return input.nextDouble();
    }

    public static void outputStrukBelanja(String tanggalJadi, String waktuJadi, String receiptNumber, String orderID, String namaStaff, String[] namaBarang, int[] jumlahPembelian, int[] hargaSatuan, int total, double diskon, double totalBayar, double bayar, double kembalian, DecimalFormat angkaFormat) {
        System.out.println("\n             235150701111026");
        System.out.println("    Taqi Talenta Ilmi Prasetya Nashif              ");
        System.out.println("=========================================");
        System.out.printf("%-35s %5s%n", tanggalJadi, waktuJadi);
        System.out.printf("%-34s%s%n", "Receipt Number\t: ", receiptNumber);
        System.out.printf("%-29s%s%n", "Order ID\t: ", orderID);
        System.out.printf("%-32s%6s%n", "Collected by\t: ", namaStaff);
        System.out.println("=========================================");

        // Looping Output Nama Barang, Jumlah Pembelian, Harga Satuan, Total Harga Barang
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.printf("%-32s\n %2dx @%-23s  %10s\n", namaBarang[i], jumlahPembelian[i],
                    angkaFormat.format(hargaSatuan[i]).replace(",","."), angkaFormat.format(jumlahPembelian[i] * hargaSatuan[i]).replace(",","."));
        }

        System.out.println("=========================================");
        System.out.printf("%-25s %-1s %10s %n", "Subtotal", " Rp.", angkaFormat.format(total).replace(",","."));
        System.out.printf("%-29s%n", "Diskon");
        System.out.printf("%-25s %-1s %10s%n", (diskon * 100) + "%", "-Rp.", angkaFormat.format(diskon * total).replace(",","."));
        System.out.println("=========================================");
        System.out.printf("%-25s %-1s %10s%n", "Total", " Rp ", angkaFormat.format(totalBayar).replace(",","."));
        System.out.printf("%-25s %-1s %10s%n", "Bayar", " Rp ", angkaFormat.format(bayar).replace(",","."));
        System.out.println("=========================================");
        System.out.printf("%-25s %-1s %10s\n", "Kembali", "-Rp ", angkaFormat.format(kembalian).replace(",","."));
        System.out.println("=========================================");
        System.out.println("\tTerima Telah Berbelanja di \n              FILKOM-MART");
        System.out.println("=========================================");
    }
}