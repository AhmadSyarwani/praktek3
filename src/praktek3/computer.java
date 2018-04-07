package praktek3;
public class computer {
        private String merek,os,warna;
        private double harga;
        
        void cetakInfo(){
            System.out.println("merek komputer \t="+merek);
            System.out.println("os komputer \t="+os);
            System.out.println("warna komputer \t="+warna);
            System.out.println("harga komputer \t="+harga);
        }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
                
}
