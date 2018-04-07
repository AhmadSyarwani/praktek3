package praktek3;
public class computeraksi {
    public static void main(String[] args) {
        computer laptop = new computer();
        laptop.merek="asus";
        laptop.os="win7";
        laptop.warna="merah";
        laptop.harga=6000;
        
        laptop.cetakInfo();
    }    
}
