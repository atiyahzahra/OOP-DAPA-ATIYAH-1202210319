public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        Perangkat device = new Perangkat("Adata", 2, 1.80F);
        device.informasi();
        System.out.println("");

        Laptop lap = new Laptop("Seagate", 8, 2.40F, true);
        lap.informasi();
        lap.bukagame("Pubg");
        lap.kirimEmail("atyzhr@gmail.com");
        lap.kirimEmail("aaqil@yahoo.com", "aaqila@gmail.com");
        System.out.println("");


        Handphone hp = new Handphone("Sandisk", 2, 2.20F, false);
        hp.informasi();
        hp.telfon(628129492);
        hp.kirimSMS(628129492);
        hp.kirimSMS(628135465, 628125363);
    }
}