package id.ac.ub.filkom;
import java.util.Scanner;

public class pemdas3_235150701111026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  total=0,totalBayar=0,jumlah=0;
        String barang;
        
        System.out.println("********************");
        System.out.println("Toko Mart");
        System.out.println("235150701111026 Taqi Talenta Ilmi Prasetya Nashif");
        System.out.println("********************");

        System.out.println("sabun harga : 1000");
        System.out.println("sampo harga : 2000");
        System.out.println("sapu harga : 1500");
        System.out.println("gula harga : 2500");


        

        
        String listBelanjaan = "";


        while (true) {
            System.out.print("\nMasukkan nama barang (selesai untuk keluar) : ");
            barang = input.nextLine();

            if(barang.equalsIgnoreCase("selesai")){
                break;
            }

            System.out.print("Masukkan jumlah : ");
            jumlah = input.nextInt();
            input.nextLine();

            int harga = 0;
            switch (barang.toLowerCase()){

                case "sabun" :
                harga = 1000;
                break;

                case "sampo" :
                harga = 2000;
                break;

                case "sapu" :
                harga = 1500;
                break;

                case "gula" :
                harga = 2500;
                break;

                default :
                System.out.println(" Barang tidak tersedia ");
                continue;

            }

            total = harga * jumlah;
            totalBayar += total;
            

            listBelanjaan+=String.format("| %-20s | %20s %c\n\n",barang,total,'|');

        }
        if(totalBayar >10000){
            totalBayar = totalBayar * 75/100;
        }else {
            totalBayar = totalBayar;
        }

        System.out.println("\nDaftar belanja");
        System.out.println("---------------------------------------------\n");
        System.out.printf("| %-20s | %-20s %c\n\n","Nama","Total Harga",'|' );
        System.out.println(listBelanjaan);
        System.out.println("---------------------------------------------");
    
        System.out.print("Total yang harus dibayar : "+totalBayar);


        input.close();
    }
}
        
        
    
    

    

