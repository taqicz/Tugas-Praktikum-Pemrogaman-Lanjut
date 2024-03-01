package semester1;
import java.util.Scanner;
public class kelas5PraktikPemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String kata = input.nextLine();

        if(kata.length()<= 4){
            for(int i = kata.length()-1 ;i>=0 ;i--){
                System.out.print(kata.charAt(i));
            }
        }
        else {
            System.out.println(kata);
        }
    
    }
    
}
