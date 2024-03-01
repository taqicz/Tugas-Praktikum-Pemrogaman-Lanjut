package semester1;
import java.util.Scanner;
public class kelas3PraktikPemdas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sisiAtas = input.nextInt();
        int sisiBawah = input.nextInt();
        int tinggi = input.nextInt();
        
            for (int i = 0; i < tinggi; i++) {
                for (int j = 0; j < (sisiBawah-sisiAtas)/2 -i ; j++) {
                    System.out.print("a ");
        
                }
                for (int j = 0 ; j < (i*2) + sisiAtas  ; j++) {
                    System.out.print("b ");
                }
            
                System.out.println();
                
            }
        }
    }
 
