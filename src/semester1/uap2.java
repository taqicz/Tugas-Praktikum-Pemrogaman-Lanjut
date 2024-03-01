package semester1;
import java.util.Scanner;

public class uap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input key
        int key = input.nextInt();
        input.nextLine();

        // Menerima input pesan terenkripsi
        String kode = input.nextLine();

        // Mengecek apakah key valid
        if (key <= 1 || key >= 100) {
            System.out.println("ERROR: Invalid key!");
        } else {
            // Melakukan dekripsi pada setiap karakter pesan terenkripsi
            String arti_kode = "";
            for (int i = 0; i < kode.length(); i++) {
                char encryptedChar = kode.charAt(i);
                int originalChar = (int) encryptedChar;

                int decryptedChar;
                if (originalChar - key < 32) {
                    decryptedChar = 127 + originalChar - 32 - key;
                } else {
                    decryptedChar = originalChar - key;
                }

                arti_kode += (char) decryptedChar;
            }

            // Menampilkan pesan hasil dekripsi
            System.out.println(arti_kode);
        }
    }
    
}
