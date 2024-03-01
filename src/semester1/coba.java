package semester1;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner inputMasuk = new Scanner(System.in);
        int totalBayar = 0;
        String yaTidak;
        

        do{

            int noMenu = inputMasuk.nextInt();
            int harga = 0;

            switch (noMenu) {
            //nasi goreng
            case 1 :
            harga = 20000;
            break;
             //mie ayam
            case 2 :
            harga = 15000;
            break;
             //sate ayam
            case 3 :
            harga = 18000;
            break;
             //ayam bakar
            case 4 :
            harga = 17000;
            break;
             //sop iga
            case 5 :
            harga = 25000;
            break;

            default :
            System.out.println("Menu nomer "+noMenu+" tidak ada");

            }
            totalBayar += harga;
            inputMasuk.nextLine();
            yaTidak = inputMasuk.nextLine().toLowerCase();

        
        }
        
        while(yaTidak.contains("ya"));

        int finalBayar = totalBayar * 110/100;
        System.out.println("Total harga makanan anda adalah Rp "+finalBayar+",-");
        
    }
}
    

