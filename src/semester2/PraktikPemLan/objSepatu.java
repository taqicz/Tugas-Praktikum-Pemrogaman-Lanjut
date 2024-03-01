package semester2.PraktikPemLan;

public class objSepatu {
    public static void main(String[] args) {

    clsSepatu sepatuA = new clsSepatu();

    sepatuA.setManufaktur("Nike");
    sepatuA.setWarna("Putih");
    sepatuA.setUkuran("41");
    sepatuA.setHarga(1800000);

    sepatuA.displayMessage();
    System.out.println(" ");
        

    clsSepatu sepatuB = new clsSepatu("Adidas","Hijau","42",2000000.0);
    sepatuB.displayMessage();

    }
    

}
