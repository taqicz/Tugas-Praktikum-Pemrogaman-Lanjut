package id.ac.ub.filkom;
import java.util.Scanner;
public class pemdas2_235150701111026 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner (System.in);
        double hasil = 0;
        System.out.println("*******************");
        System.out.println("Kalkulator v1.0");
        System.out.println("235150701111026 Taqi Talenta Ilmi Prasetya Nashif");
        System.out.println("*******************");
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();
        input.nextLine();
        System.out.print("Masukkan operator matematika (;+,-,*,atau/): ");
        String operator = input.nextLine();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();
        
        switch(operator){
            case("+"):
                hasil = bilangan1 + bilangan2;
                break;
            case("-"):
                hasil = bilangan1 - bilangan2;
                break;
            case("*"):
                hasil = bilangan1 * bilangan2;
                break;
            case("/"):
                hasil = bilangan1 / bilangan2;
                break;
            default:
            System.out.println("Kalkulator tidak memadai");


        }
        System.out.println("Hasil Operasi: "+ hasil);
        input.close();
    }
}
