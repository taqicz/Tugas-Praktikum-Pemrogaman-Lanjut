package semester2.projectLingkaran.kelas;

public class clsLingkaran {
    //atribut
    public int jejari;
    private double phi = Math.PI;
    private double luas;
    private double keliling;

    //method
    public double getLuas(){
        double luas;
        luas = phi*jejari*jejari;
        this.luas = luas;
        return this.luas;
    }

    public double getKeliling(){
        keliling = phi*2*jejari;
        return keliling;
    }

}
