package semester1;
import java.util.Arrays;
import java.util.Scanner;
public class kelas7PraktikPemdas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String splitted[] = text.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            String kiw = splitted[i];
            char[] bu = kiw.toCharArray();
            System.out.println(bu);
            Arrays.sort(bu);
            System.out.println(bu);
            String sU = new String(bu);
            // System.out.print(sU + " ");

        }

    

    }
}
