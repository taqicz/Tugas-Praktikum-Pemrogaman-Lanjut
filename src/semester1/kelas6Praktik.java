package semester1;
import java.util.Scanner;

public class kelas6Praktik {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        // int n = masuk.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print("# ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        int hasil = masuk.nextInt();
        while (true) {
            String operasi = masuk.next();
            if (operasi.equals("=")) {
                System.out.println(hasil);
                break;
            }
            int bilangan = masuk.nextInt();
            switch (operasi) {
                case "+":
                    hasil += bilangan;
                    break;
                case "-":
                    hasil -= bilangan;
                    break;
                case "x":
                    hasil *= bilangan;
                    break;
                case "/":
                    hasil /= bilangan;
                    break;
                default:
                    System.out.println("Kalkulator tidak memadai brow");
            }
        }
    }
}
    

