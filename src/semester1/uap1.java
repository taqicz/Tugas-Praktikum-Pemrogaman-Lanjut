package semester1;
import java.util.Scanner;

public class uap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca input username dan password
        String username = input.nextLine();
        String password = input.nextLine();

        // Validasi username
        if (username.length() < 5 || username.contains(" ")) {
            System.out.println("Username tidak valid:");
            if (username.length() < 5) {
                System.out.println("Panjang username harus minimal 5 karakter.");
            }
            if (username.contains(" ")) {
                System.out.println("Username tidak boleh mengandung spasi.");
            }
        } else {
            System.out.println("Username valid.");
        }

        if (password.length() < 8 || !Character.isUpperCase(password.charAt(0))) {
            System.out.println("Password tidak valid:");
            if (password.length() < 8) {
                System.out.println("Panjang password harus minimal 8 karakter.");
            }
            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("Password harus diawali dengan huruf kapital.");
            }
        } else {
            System.out.println("Password valid.");
        }
    }
    
}
