public class PegawaiTetap extends Pegawai {
    private double bonus;
    private int gajiPokok;

    public PegawaiTetap(String nama, int gajiPokok, double insentif, double bonus) {
        super(nama, insentif);
        this.bonus = bonus;
        this.gajiPokok = gajiPokok;
    }
        public void getRincian(){
      System.out.println("-------------------------");
      System.out.println("Rincian gaji " + getNama());
      System.out.println("Status : Pegawai Kontrak");
      System.out.println("Gaji pokok : " + getGajiPokok());
      System.out.println("TotalBonus : " + (int)(getGajiPokok()*getBonus()));
      System.out.println("Total Insentif : " + (int)(getGajiPokok()*getInsentif()));
      System.out.println("Total gaji : " + (int)(getGajiPokok()+(getGajiPokok()*getBonus())+(getGajiPokok()*getInsentif())));
      System.out.println("-------------------------");
    }
    public int getGajiPokok() {
        return gajiPokok;
    }

    public double getBonus() {
        return bonus;
    }

}
