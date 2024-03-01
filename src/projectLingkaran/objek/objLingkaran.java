package projectLingkaran.objek;
import java.util.Scanner;

import projectLingkaran.kelas.clsLingkaran;
public class objLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clsLingkaran lingA = new clsLingkaran();
        clsLingkaran lingB = new clsLingkaran();
        
        System.out.print("Jari -Jari Lingkaran A : ");
        lingA.jejari = input.nextInt();

        System.out.println("Luas Lingkaran A : " + lingA.getLuas());
        System.out.println("Keliling Lingkaran A : " +lingA.getKeliling());

        System.out.print("\nJari -Jari Lingkaran B : ");
        lingB.jejari = input.nextInt();
        
        System.out.println("\nLuas Lingkaran B : " + lingB.getLuas());
        System.out.println("Keliling Lingkaran B : " + lingB.getKeliling());

        input.close();

    }
    
}
