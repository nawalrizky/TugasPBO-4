public class PegawaiKontrak extends Pegawai{
   private double gaji;
   private int jamKerja;

   public PegawaiKontrak(String nama, double gaji, double insentif,  int jamKerja) {
      super(nama, insentif);
      this.gaji = gaji;
      this.jamKerja = jamKerja;
   }

   public double getGaji() {
      return gaji;
   }

   public int getJamKerja() {
      return jamKerja;
   }

   public void getRincian(){
      System.out.println("-------------------------");
      System.out.println("Rincian gaji " + getNama());
      System.out.println("Status : Pegawai Kontrak");
      System.out.println("Gaji pokok : " + (int)getGaji()*getJamKerja());
      System.out.println("TotalBonus : 0");
      System.out.println("Total Insentif : " + (int)(getGaji()*getJamKerja()*getInsentif()));
      System.out.println("Total gaji : " + (int)(getGaji()*getJamKerja()+getGaji()*getJamKerja()*getInsentif()));
      System.out.println("-------------------------");
   }

}
