package semester1;
import java.util.Scanner;

public class cobaError {
    static Scanner read= new Scanner(System.in);
    static void penjumlahan(int a,int b){
        System.out.println("=== METHOD PENJUMLAHAN ===");
        System.out.println(a + " + "+ b + " = " + (a+b));
    }
    static void pengurangan(int a,int b){
        System.out.println("=== METHOD PENGURANGAN ===");
        System.out.println(a + " - "+ b + " = " + (a-b));
        //
    }
    static void pembagian(int a,int b){
        System.out.println("=== METHOD PEMBAGIAN ===");
        System.out.println(a + " / "+ b + " = " + (a/b));
        //
    }
    static void perkalian(int a,int b){
        System.out.println("=== METHOD PERKALIAN ===");
        System.out.println(a + " * "+ b + " = " + (a*b));
        //
    }
    public static void main(String[] args) {
        String x= read.nextLine();
        String [] sSplit=x.split(" ");

        int angka1 = Integer.parseInt(sSplit[1]);
        int angka2 = Integer.parseInt(sSplit[2]);
        
    switch (sSplit[0]) {
            case "+":
                penjumlahan(angka1,angka2);
                break;
            case "-":
                pengurangan(angka1, angka2);
                break;
            case "*":
                perkalian(angka1, angka2);
                break;
            case "/":
                pembagian(angka1, angka2);
                break;
            default:
				System.out.println("ERROR BOSKU");
                break;
        }
    }
}