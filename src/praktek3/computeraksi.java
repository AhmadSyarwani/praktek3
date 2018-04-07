package praktek3;
public class computeraksi {
    public static void main(String[] args) {
        computer laptop = new computer();
       
        laptop.setMerek("asus");
        laptop.setOs("win7");
        laptop.setWarna("biru");
        laptop.setHarga(6000);
        
        laptop.cetakInfo();
    }    
}
