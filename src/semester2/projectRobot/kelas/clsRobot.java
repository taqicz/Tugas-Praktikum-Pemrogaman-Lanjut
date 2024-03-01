package semester2.projectRobot.kelas;

public class clsRobot {

    public clsRobot(){

    }
    
    // public clsRobot(
    //     clsLingkaran kepalaRobot,
    //     clsSegitiga badan,
    //     clsPersegiPanjang tangan,
    //     clsPersegiPanjang kaki,
    //     clsPersegiPanjang bawah)
    //     {
    //     this.kepalaRobot = kepalaRobot;
    //     this.badan = badan;
    //     this.tangan = tangan;
    //     this.kaki = kaki;
    //     this.bawah = bawah;
    // }

    public clsRobot(
        double kepalaRobotJejari,
        double badanAlas,
        double badanTinggi,
        double tanganPanjang,
        double tanganLebar,
        double kakiPanjang,
        double kakiLebar,
        double bawahPanjang,
        double bawahLebar)
        {
        this.kepalaRobot.jejari = kepalaRobotJejari;
        this.badan.alas= badanAlas;
        this.badan.tinggi= badanTinggi;
        this.tangan.panjang = tanganPanjang;
        this.tangan.lebar = tanganLebar;
        this.kaki.panjang = kakiPanjang;
        this.kaki.lebar = kakiLebar;
        this.bawah.panjang = bawahPanjang;
        this.bawah.lebar = bawahLebar;
    }
    public clsLingkaran kepalaRobot = new clsLingkaran();
    public clsSegitiga badan = new clsSegitiga();
    public clsPersegiPanjang tangan = new clsPersegiPanjang();
    public clsPersegiPanjang kaki = new clsPersegiPanjang();
    public clsPersegiPanjang bawah = new clsPersegiPanjang();
    
    public double getLuasRobot(){
        return  kepalaRobot.getLuas() + badan.getLuas()+ tangan.getLuas()*2 + bawah.getLuas() + kaki.getLuas()*2;
        
    }

    public double getKelilingRobot(){
        return kepalaRobot.getKeliling() + badan.getKeliling() + tangan.getKeliling()*2 + bawah.getKeliling()+kaki.getKeliling()*2;
    }
}
