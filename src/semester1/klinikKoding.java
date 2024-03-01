package semester1;
import java.util.Scanner;
public class klinikKoding {
    public static void main(String[] args) {
        
        /*
        Scanner input = new Scanner (System.in);

        Keliptan
        int n = input.nextInt();
        int k = input.nextInt();


        if(n == 0){
            System.out.println("nol");
        }
        else {
            if ( n%k == 0){
            System.out.println("BENAR");
        }
        else{
            System.out.println("SALAH");
        }

        
    }

    WamBoomPow
    int x = input.nextInt();

    if(x % 3==0)System.out.println("Wam");
    if(x % 5==0)System.out.println("Boom");
    if(x % 7==0)System.out.println("Pow");


/*
    String nama = input.nextLine();
    int angkaUnik = input.nextInt();
    int order = input.nextInt();
    
    if(angkaUnik % 2 == 0 && angkaUnik % 3 == 0 && angkaUnik % 5 ==0){
        System.out.println("Tidak ada pesanan");
    }else{
        double total = 0;
        
        System.out.println("PROGRAM  KASIR SOTO SATE CL");
        System.out.printf("Nama pemesan :%s\n\n",nama);

        System.out.printf("|%-20s|%-15s|%20s\n","NAMA PESANAN","JUMLAH","HARGA");

        if(angkaUnik % 2==0){
            System.out.printf("|%-20s|%-15d|%20s\n","Nasi",order,3_000*order);
            total+= 3_000*order;
        }
        if(angkaUnik % 3==0){
            System.out.printf("|%-20s|%-15d|%20s\n","Soto",order,7_000*order);
            total += 7_000*order;
        }
        if(angkaUnik % 7==0){
            System.out.printf("|%-20s|%-15d|%20s\n","Sate",order,5_000*order);
            total += 5_000 *order;
        }
        System.out.println("");
        System.out.printf("Total pesanan : Rp %.0f \n   ",total);

    }
     */


     //FIlkom Mart
/*
    Scanner input = new Scanner (System.in);

    double total = input.nextInt();
    input.nextLine();
    String member = input.nextLine().toLowerCase();
    String tanggal = input.next();

    double diskon = 0;

if(total>=50_000){
    if(member.contains("reguler")){
    total -= diskon;
    } else if (member.contains("gold")){
    diskon = total*0.1;
    total -= diskon;
    }else if(member.contains("platinum")){
    diskon = total * 0.2;
    total -=diskon;
    }
}else{
    diskon = 0;
}

double diskonCantik = 0;

if(tanggal.substring(0, 1).equals(tanggal.substring(3, 4))){
    diskonCantik = total*0.5;
    total -= diskonCantik;
}else{
    diskonCantik=0;
    total -= diskonCantik;
}


System.out.printf("%.0f",total);
 */



//abc besar kecil
/*
Scanner input = new Scanner (System.in);

String kata = input.nextLine();

char pertama =  kata.charAt(0);
char kedua =  kata.charAt(1);
char ketiga =  kata.charAt(2);

if(pertama > kedua && pertama >ketiga){
    System.out.println("Terbesar");
} else if (( pertama < kedua && pertama > ketiga) || (pertama > kedua && pertama < ketiga )){
    System.out.println("Rata-rata");
} else if (pertama < kedua && pertama < ketiga){
    System.out.println("Terkecil");
} else {
    System.out.println("Wah sama");
}
*/

Scanner input = new Scanner (System.in);

int waktuS = input.nextInt();
int jarak = input.nextInt();


}
}
