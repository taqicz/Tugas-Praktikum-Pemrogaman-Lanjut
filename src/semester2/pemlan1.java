package semester2;
import java.util.Scanner;
public class pemlan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jari -Jari Lingkaran Progam Menghitung Luas dan Keliling ");
        System.out.print("Masukkan Jari -Jari Lingkaran : ");
        final double phi = 3.14;

        //input jari-jari
        double r = input.nextDouble();
        
        //input luas
        double luas =phi* r * r;

        //input keliling
        double keliling = phi * 2*r;
        
        //output
        System.out.println("Luas Lingkaran =  "+ luas);
        System.out.println("Keliling Lingkaran =  "+ keliling);

        input.close();

    }
    
}

