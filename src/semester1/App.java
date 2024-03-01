package semester1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("=============");
        System.out.print("Masukkan Sisi Tinggi : ");
        int tinggiBangun = input.nextInt();
        System.out.println("-----------------");

        for(int i = 1 ; i <= tinggiBangun ; i++ ){
            for(int j = 1 ; j < i ; j++){
                System.out.print("a ");
            }
                System.out.println("b ");
            }
            
            System.out.println("-----------------");

        for(int i = 1 ; i <= tinggiBangun ; i++ ){
            for(int j = 1 ; j < tinggiBangun ; j++){
                System.out.print("a  ");
            }
                System.out.println("b ");
            }

            System.out.println("\n-----------------\n");
        }


    }

