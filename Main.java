import Base.Makanan;

public class Main {

    public static void main(String[] args) {
      Makanan e = new Makanan("Bakmie Goreng", 50000, 300, 30);
        e.setExpired(30);
        e.tampilData();
        
    }
}
