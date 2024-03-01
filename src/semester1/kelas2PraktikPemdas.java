package semester1;
import java.util.Scanner;
public class kelas2PraktikPemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // double harga = input.nextInt();
        // input.nextLine();
        // String status = input.nextLine().toLowerCase();
        // String delivery;

        // double totalHarga = 0;
        // String hargaFormat = String.format("Rp %,.2f",harga);
    

        // if(status.contains("ambil")){
        //     delivery = "Diambil";
        //     totalHarga = harga;
        //     System.out.println("Total harga belanja : "+hargaFormat);
        //     System.out.println("Status delivery : "+delivery);

        // }
        // else if (status.contains("kirim")){
        //     delivery = "Diantarkan";
        //     totalHarga = 1.10*harga;
        //     String totalFormat = String.format("Rp %,.2f",totalHarga);
        //     System.out.println("Total harga belanja : "+hargaFormat);
        //     System.out.println("Status delivery : "+delivery);
        //     System.out.println("Total harga yang perlu dibayar : "+totalFormat);
        // } else {
        //     delivery = "buang aja";
        // }
        


        //============================================================
        

        String nama1 = input.next();
        String pil1 = input.nextLine().toLowerCase();
        String nama2 = input.next();
        String pil2 = input.nextLine().toLowerCase();


        if(pil1.contains("batu")){
            if(pil2.contains("batu")){
                System.out.println(nama1+ " dan "+nama2 +" seri" );
            }else if (pil2.contains("gunting")){
                System.out.println(nama1 +" menang");
            }else if (pil2.contains("kertas")){
                System.out.println(nama2 + " menang");
            }

        }
        else if(pil1.contains("gunting")){
            if(pil2.contains("gunting")){
                System.out.println(nama1+ " dan "+nama2 +" seri" );
            }else if (pil2.contains("batu")){
                System.out.println(nama2 +" menang");
            }else if (pil2.contains("kertas")){
                System.out.println(nama1 + " menang");
            }
        }
        else if ((pil1.contains("kertas"))){
            if(pil2.contains("kertas")){
                System.out.println(nama1+ " dan "+nama2 +" seri" );
            }else if (pil2.contains("gunting")){
                System.out.println(nama2 +" menang");
            }else if (pil2.contains("batu")){
                System.out.println(nama1 + " menang");
            }
        }



































    }
}
