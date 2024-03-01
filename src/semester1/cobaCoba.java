package semester1;
import java.util.Scanner;

public class cobaCoba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = 1 ;
        int s = u ;
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i ++){
            u = u + 2 ;
            s = s + u ;
        }
        System.out.println(u+" "+s);
    }
}