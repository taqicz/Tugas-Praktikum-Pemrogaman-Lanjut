package semester2.PraktikPemLan;

public class clsSepatu {

    private String ukuran;
    private String manufaktur;
    private String warna;
    private double harga;

    clsSepatu(){

    }

    clsSepatu(String manufaktur,String warna, String ukuran,double harga){
        this.manufaktur = manufaktur;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }


    public void setUkuran(String s) {
        ukuran = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setHarga(double d) {
        harga = d;
    }

    public void displayMessage(){
        System.out.println("Merk Sepatu\n : "+ manufaktur);
        System.out.println("Warna Sepatu\n : "+ warna);
        System.out.println("Ukuran Sepatu\n : "+ ukuran);
        System.out.println("Harga Sepatu\n : "+ harga);
    }

    public String getManufaktur(){
        return manufaktur;
    }
    public String getWarna(){
        return warna;
    }
    public String getUkuran(){
        return ukuran;
    }
    public double getHarga(){
        return harga;
    }
    
}
