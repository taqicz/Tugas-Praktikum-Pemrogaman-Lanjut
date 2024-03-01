package semester1;
public class latuUap {
    public static void main(String[] args) {
//         int a = 2;
//         int b = 5;
//         int t = 2 * b;
//         b = 2*a;
//         a = t;
//         System.out.printf("a=%d b=%d\n",a,b);
//=====================
//         boolean x = true;

//         float f = 3.18F ;
//=======================
//         int aa= 7;
//         double as;
//         as = aa/3;

//         System.out.println(as);
//=======================
//         int i = 1, j = -1;

// switch(i) {
//     case 1 : j = 1;

//     case 2 : j = 2;

//     default : j = 0 ;

// }

// System.out.println("J = " + j);

//======================================
//     int y = 0;
//     int p = 0;

//     if ((++y > 2) || (++p > 2)){
//         y++;
//     }
//         System.out.println(y + " " + p);
// ====================================
//         int counter = 1 , jumlah = 0;
//             while(counter < 10){
//                 jumlah = jumlah + counter;
//                 counter += 2 ;
//             }
//             System.out.println("Jumlah = "+ jumlah);
//================================

        // int x , z;
        // for ( x = 0; x < 2; x++){
        //     if(x == 0 ) continue;
        //     System.out.println("Selamat \n");
        //     for ( z = x; z < 3; z++ ){
        //         if ( z== 2) break;
        //         System.out.println("Datang \n");
        //     }
        // }
        // System.out.println("Di PTIIK UB \n");
        //========================================================
        // int x =  1 % 6;
        // System.out.println(x);
        // String nama = "mad";
        // char bw = 's';

        // final Boolean BW = true;
//=============================
        // int All;
        // int a=2, b=3, c=6, d=5;
        // All = b * d - c / a + b;
        // System.out.println(All);

        // int x = 3, y = 0;
        // y = --x +2 * x * ++x ;
        // System.out.println(y);
        // System.out.println(x);

//=========================
int[] myArray = {20, 70, -10, 0, 20}; 
int a, b, c, d;
int i = 0;
b = 0; c = d = myArray[i];
for (i = 0; i < myArray.length; i++) {
    if (myArray[i] > c) {
        c = myArray[i];
    }
    else if (myArray[i] < d) {
        d = myArray[i];
    }
    b += myArray[i];
}
a = b / myArray.length;

System.out.println(a);

    }

}