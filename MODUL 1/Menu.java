public class Menu {

    // TODO Create Attribute of Menu; Name, Category, and Price then Create Setter
    string menu ;
    string category ;
    int price ;

    public void setMenu (string menu){
        this.menu = menu ;
        System.out.println("1. Bakso");
        System.out.println("2. Es Teh");
        System.out.println("3. Brownies");
    }

    public void setCategory (string category){
        this.category = category ;
        
    }

    public void setPrice (int price){
        this.price = price ;

    }

}
