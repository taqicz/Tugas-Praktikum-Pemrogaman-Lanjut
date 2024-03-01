package semester1;
import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String inputData = masuk.nextLine();
        String nama = inputData.substring(0,inputData.indexOf(" "));
        String identitas = inputData.substring(inputData.indexOf(" ")+1);
        String user = identitas.substring(0,identitas.indexOf(" ") );
        String x = identitas.substring(identitas.indexOf(" ")+1);
        String domain = x.substring(0,x.indexOf(" ") );
        String skip = x.substring(x.indexOf(" ")+1);
        String dns = domain.substring(0,domain.lastIndexOf(".")+1 );

        double hargaNaik = 1;

        if(dns.equals("id")){
            hargaNaik = 1.75;
        } else if(dns.equals("com")){
            hargaNaik = 1.50;
        } else if (dns.equals("net")){
            hargaNaik = 1.25;
        }

        double hargaAkhir = Double.parseDouble(skip);

        System.out.println("Nama email baru: "+ user + "@" + domain + hargaAkhir);
        System.out.println("Nama domain untuk Aji: "+ domain +"."+ dns);
        System.out.printf("Total harga pembelian: %2.f$",hargaAkhir*hargaNaik);

    }
}
