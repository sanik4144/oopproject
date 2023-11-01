public class Medicine extends Med{                                          //Inheritance
    public int mfee=0;
    @Override
    public void paracitamol(){
        System.out.println("Paracitamol Added");
        this.mfee+=50;
    }
    public void paracitamol(int n){                                         //Method Overloading
        System.out.println("Paracitamol Fee: 50");
    }
    
    @Override
    public void ibuprofen(){
        System.out.println("Ibuprofen Added");
        this.mfee+=300;
    }
    public void ibuprofen(int n){                                         //Method Overloading
        System.out.println("Ibuprofen Fee: 300");
    }
    
    @Override
    public void antihistamine(){
        System.out.println("Antihistamine Added");
        this.mfee+=500;
    }
    public void antihistamine(int n){                                         //Method Overloading
        System.out.println("Antihistamine Fee: 500");
    }
    
    @Override
    public void antidiarrhoea(){
        System.out.println("Antidiarrhoea Added");
        this.mfee+=130;
    }
    public void antidiarrhoea(int n){                                         //Method Overloading
        System.out.println("Antidiarrhoea Fee: 130");
    }
    
    @Override
    public void moisturiser(){
        System.out.println("Moisturiser Added");
        this.mfee+=470;
    }
    public void moisturiser(int n){                                         //Method Overloading
        System.out.println("Moisturiser Fee: 470");
    }
    
    
    
    public void totalfee(){
        System.out.println("Total Medicine Fee: "+this.mfee);
    }
}
