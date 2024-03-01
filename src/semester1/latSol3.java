package semester1;
import java.util.Arrays;
import java.util.Scanner;

public class latSol3 {
    // 3 6
    // kktkkk
    // kmpptk
    // kkkkkk
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] status = { 'm', 'p', 'k', 't' }; // Array yang berisi karakter status
        char[] biner = { '0', '1' }; // Array yang berisi karakter biner
        int baris = sc.nextInt(); // Input jumlah baris
        int kolom = sc.nextInt(); // Input jumlah kolom
        char[][] map1 = new char[baris][kolom];
        char[][] map2 = new char[baris][kolom];
        // map[3][6]
        // map1.length = 3 (mengukur panjang baris)
        // map1[0].length = 6 (panjang kolom)

        // Loop input sesuai dengan jumlah baris
        for (int i = 0; i < map1.length; i++) {
            String kondisi = sc.next();// kktkkk
            map1[i] = kondisi.toCharArray();

        }
        // k,k,t,k,k,k
        // k,m,p,p,t,k
        // k,k,k,k,k,k

        // Loop untuk mengisi map2 sesuai aturan yang diberikan
        for (int i = 1; i < map1.length; i++) {
            for (int j = 0; j < map1[1].length; j++) {
                // Cek status dan isi map2 sesuai aturan
                if (map1[i][j] == status[0]) { // ini M
                    map2[i][j] = biner[0];
                }
                if (map1[i][j] == status[2]) { // ini K
                    map2[i][j] = biner[0];
                }
                if (map1[i][j] == status[1]) { // ini P
                    map2[i][j] = biner[1];
                    // Atas kanan
                    if (i - 1 >= 0 && j + 1 < kolom) {
                        if (map1[i - 1][j + 1] == status[3]) {
                            map2[i - 1][j + 1] = biner[1];
                        }
                    }
                    // Atas
                    if (i - 1 >= 0) {
                        if (map1[i - 1][j] == status[3]) {
                            map2[i - 1][j] = biner[1];
                        }
                    }
                    // Atas kiri
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        if (map1[i - 1][j - 1] == status[3]) {
                            map2[i - 1][j - 1] = biner[1];
                        }
                    }
                    // Kanan
                    if (j + 1 < kolom) {
                        if (map1[i][j + 1] == status[3]) {
                            map2[i][j + 1] = biner[1];
                        }
                    }
                    // Kiri
                    if (j - 1 >= 0) {
                        if (map1[i][j - 1] == status[3]) {
                            map2[i][j - 1] = biner[1];
                        }
                    }
                    // Kiri bawah
                    if (i + 1 < baris && j - 1 >= 0) {
                        if (map1[i + 1][j - 1] == status[3]) {
                            map2[i + 1][j - 1] = biner[1];
                        }
                    }
                    // Bawah
                    if (i + 1 < baris) {
                        if (map1[i + 1][j] == status[3]) {
                            map2[i + 1][j] = biner[1];
                        }
                    }
                    // Kanan bawah
                    if (i + 1 < baris && j + 1 < kolom) {
                        if (map1[i + 1][j + 1] == status[3]) {
                            map2[i + 1][j + 1] = biner[1];
                        }
                    }
                }
            }
        }

        // Loop untuk menampilkan hasil map2
        for (int i = 0; i < map2.length; i++) {
            System.out.println(Arrays.toString(map2[i]));
        }
    }
}