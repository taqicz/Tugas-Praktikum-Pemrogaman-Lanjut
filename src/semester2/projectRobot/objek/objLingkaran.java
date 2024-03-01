package semester2.projectRobot.objek;

import semester2.projectRobot.kelas.clsRobot;



public class objLingkaran {

    public static void main(String[] args) {

        clsRobot robotku = new clsRobot();

        //kepala robot
        robotku.kepalaRobot.jejari = 10;

        //badan robot
        robotku.badan.alas = 20;
        robotku.badan.tinggi = 20;

       //tangan robot
        robotku.tangan.panjang = 15;
        robotku.tangan.lebar = 2;

       //bawah robot
        robotku.bawah.panjang = 15;
        robotku.bawah.lebar = 3;

       // kaki robot
        robotku.kaki.panjang = 20;
        robotku.kaki.lebar = 2;

        

        System.out.println("Total Luas Robot = " + robotku.getLuasRobot() );
        System.out.println("Total Keliling Robot = " + robotku.getKelilingRobot()+"\n" );
        
        
        clsRobot robotKuat = new clsRobot(
            10,
            20,
            20,
            15,
            2,
            15,
            3,
            20,
            2);
            
            System.out.println("Total Luas Robot = " + robotKuat.getLuasRobot() );
            System.out.println("Total Keliling Robot = " + robotKuat.getKelilingRobot() );
            
        }
    
}
