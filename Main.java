
import Base.Produk;

public class Main {

    public static void main(String[] args) {
        Produk p = new Produk("Mie Goreng", 3500, 100);

        System.out.println(p.getNama());
        System.out.println(p.getHarga());

        p.setHarga(7000.0);
        p.setStok(900);

        System.out.println(p.getNama());
        System.out.println(p.getHarga());
        System.out.println(p.getStock());
    }
}
