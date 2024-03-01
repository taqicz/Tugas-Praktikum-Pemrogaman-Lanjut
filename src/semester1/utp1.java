package semester1;
import java.util.Scanner;

public class utp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tipeKendaraan = input.nextInt();
        int lamaParkir = input.nextInt();
        int bayar = input.nextInt();
        
        int biayaParkir = 0;
        
        switch (tipeKendaraan) {
            //motor
            case 1:
                biayaParkir = lamaParkir * 2000;
                break;
                //mobil
            case 2:
                biayaParkir = lamaParkir * 4000;
                break;
                //bis
            case 3:
                biayaParkir = lamaParkir * 9000;
                break;
            default:
                System.out.println(" kendaraan gajelas.");
            
        }
        int uangKembali = bayar - biayaParkir;
        
        if (uangKembali == 0) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (uangKembali < 0) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            int receh10k = uangKembali / 10000;
            uangKembali = uangKembali % 10000;

            int receh5k = uangKembali / 5000;
            uangKembali = uangKembali % 5000;
            
            int receh500 = uangKembali / 500;
            uangKembali = uangKembali % 500;
            int receh100 = uangKembali / 100;
            
            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.println( receh10k + " uang 10.000");
            System.out.println(receh5k + " uang 5.000");
            System.out.println(receh500 + " uang 500");
            System.out.println(receh100 + " uang 100");
        }

    }
}






