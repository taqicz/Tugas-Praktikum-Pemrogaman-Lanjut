package semester1;
import java.util.Random;

public class QuizArray {
    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        Random acak = new Random();

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = acak.nextInt(100) + 1;
        }

        int[] bilGenap = new int[myNumbers.length];
        int banyakGenap = 0;
        int[] bilGanjil = new int[myNumbers.length];
        int banyakGanjil = 0;

        for (int i : myNumbers) {
            if (i % 2 == 0) {
                bilGenap[banyakGenap] = i;
                banyakGenap++;
            } else {
                bilGanjil[banyakGanjil] = i;
                banyakGanjil++;
            }
        }

        System.out.print("Nilai genap:");
        for (int i = 0; i < banyakGenap; i++) {
            System.out.print(" " + bilGenap[i]);
        }
        System.out.println("\nJumlah bilangan genap: " + banyakGenap);

        System.out.print("Nilai ganjil:");
        for (int i = 0; i < banyakGanjil; i++) {
            System.out.print(" " + bilGanjil[i]);
        }
        System.out.println("\nJumlah bilangan ganjil: " + banyakGanjil);

    }
    
}
