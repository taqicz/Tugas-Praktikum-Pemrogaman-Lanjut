package semester1;
import java.util.Scanner;

public class uap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int baris = input.nextInt();
        int kolom = input.nextInt();
        
        String[][] map = new String[baris][kolom];
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                map[i][j] = input.next();
            }
        }
        
        String target = input.next();
        
        boolean ketemu = false;
        int baris_target = -1;
        int baris_kolom = -1;
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (map[i][j].equals(target)) {
                    ketemu = true;
                    baris_target = i;
                    baris_kolom = j;
                    break;
                }
            }
            
            if (ketemu) {
                break;
            }
        }
        
        if (ketemu) {
            System.out.println("Target wilayah " + target + " ditemukan! Segera menuju daerah " + baris_target + "," + baris_kolom);
        } else {
            System.out.println("Wilayah " + target + " tidak ditemukan, peta invalid!");
        }
        
    
    }
    
}
