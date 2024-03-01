package semester2.projectRobot.kelas;

import java.lang.Math;

public class clsSegitiga {

    public double alas;
    public double tinggi;
    
    public double getLuas(){
        return 1/2*alas*tinggi;
    }

    public double getKeliling(){

        double miring = Math.sqrt((alas*alas)+(tinggi+tinggi));
        return  2*miring + alas;

    }
}
