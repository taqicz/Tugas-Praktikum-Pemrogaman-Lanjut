package semester2.projectRobot.kelas;

public class clsLingkaran {

    public double  jejari;
    private double phi = Math.PI;

    public double getLuas(){
        double luasKepala = jejari*jejari*phi;
        return luasKepala;
    }

    public double getKeliling(){
        return jejari*2*phi;
    }




    
}
