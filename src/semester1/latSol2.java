package semester1;
import java.util.Scanner;
public class latSol2 {

    static void hitungan(int x){
        for(int i = x ; i > 0 ;i--){
            if(i%2 == 0 ){
                System.out.println(i + " Genap");
            } else {
                System.out.println(i + " Ganjil");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        hitungan(input.nextInt());

        
    }
    
}
