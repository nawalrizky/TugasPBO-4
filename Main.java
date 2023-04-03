public class Main {
    public static void main(String[] args) {
        PegawaiTetap ina = new PegawaiTetap("Ina",5000000,0.025,0.2);
        PegawaiTetap eko = new PegawaiTetap("Eko",3500000,0.025,0.2);
        PegawaiKontrak adi = new PegawaiKontrak("Adi",40000, 0.025, 80);

        ina.getRincian();
        eko.getRincian();
        adi.getRincian();
    }
}