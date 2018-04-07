package praktek3;
public class computeraksi {
    public static void main(String[] args) {
        computer adul = new computer();
       
        adul.setMerek("asus");
        adul.setOs("win7");
        adul.setWarna("biru");
        adul.setHarga(6000);
        // ga jalan adul.setjenisComputer();
        
        adul.cetakInfo();
        
        System.out.print("Mereknya \t= ");
        System.out.println(adul.getMerek());
        System.out.print("OS \t= ");
        System.out.println(adul.getOs());
        System.out.print("Warna \t= ");
        System.out.println(adul.getWarna());
        System.out.print("Harga \t= ");
        System.out.println(adul.getHarga());
        
        laptop udin = new laptop();
        udin.setMerek("acer");
        udin.setOs("win10");
        udin.setWarna("hitam");
        udin.setHarga(100000);
        udin.setJenisLaptop("acer212");
        udin.cetakInfo();
        System.out.println("Jenis \t="+udin.getJenisLaptop());
        udin.throttle();
    }    
}