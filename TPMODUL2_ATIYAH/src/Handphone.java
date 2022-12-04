public class Handphone extends Perangkat{
    protected Boolean fingerprint;
    protected String teks;
    

    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    @Override
    public void informasi() {
        if(fingerprint==true){
            teks = "memiliki fingerprint";
        }
        else{
            teks = "tidak memiliki fingerprint";
        }
        System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan prosesor secepat "+processor+" Selain itu handphone ini "+teks);
    }
    public void telfon (int no_hp){
        System.out.println("Handphone berhasil menyambungkan ke telfon ke No "+no_hp);
    }
    public void kirimSMS (int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke telfon ke No "+no_hp);
    }
    public void kirimSMS (int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke telfon ke No "+no_hp1+" dan ke No "+no_hp2);
    }
}