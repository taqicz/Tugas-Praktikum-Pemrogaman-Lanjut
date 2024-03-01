package semester1;
import java.util.Scanner;

public class utp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sudutElevasi = Math.toRadians(input.nextDouble());
        double kecepatanKJ = input.nextDouble();
        double tinggiGedung = 50;

        double kecepatanMs = kecepatanKJ * 1000  / 3600;
        double jarak = kecepatanMs * 6;
        double jarakPegang = Math.ceil(tinggiGedung / Math.tan(sudutElevasi));

        boolean bisaGa = jarak >= jarakPegang;
        System.out.printf("Jarak horizontal bola terhadap gedung: %.0f meter%nPeserta dapat menangkap bola: %b", jarak, bisaGa);
    }
}







    

