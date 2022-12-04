public class Laptop extends Perangkat {
    protected Boolean webcam; 

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @Override
    public void informasi(){
        if(webcam){
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. selain itu laptop ini juga memiliki webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe"+drive+"dengan ram sebesar"+ram+"GB dan processor secepat"+processor+"Ghz. selain itu laptop ini tidak memiliki webcam");
        }  
    }
    public void bukagame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke "+email);
    }
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke "+email1+" dan ke "+email2);
    }   
}