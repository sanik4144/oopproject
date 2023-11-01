public class Doctor implements Test{                     //Inheritance
    
    private boolean firstVist;
    private boolean spdoc;
    public int fee;
    
    public Doctor(boolean firstVisit){
        this.firstVist=firstVisit;
        if(firstVist){
            this.fee=700;
        }
        else{
            this.fee=500;
        }
    }
    
    public Doctor(boolean firstVisit,boolean specialdoc){                 //Constructor Overloading
        this.spdoc=specialdoc;
        if(firstVisit && spdoc){
            this.fee=1000;
        }
        else{
            this.fee=800;
        }
    }
    
    @Override
    public void urinetest(){
        System.out.println("Urine Test Added");
        this.fee+=700;
    }
    public void urinetest(int n){                                         //Method Overloading
        System.out.println("Urine Test Fee: 700");
    }
    
    @Override
    public void bloodtest(){
        System.out.println("Blood Test Added");
        this.fee+=1500;
    }
    public void bloodtest(int n){
        System.out.println("Blood Test Fee: 1500");                     //Method Overloading
    }
    
    @Override
    public void xray(){
        System.out.println("X-Ray Added");
        this.fee+=500;
    }
    public void xray(int n){
        System.out.println("X-Ray Fee: 500");                           //Method Overloading
    }
    
    @Override
    public void MRI(){
        System.out.println("MRI Added");
        this.fee+=8000;
    }
    public void MRI(int n){
        System.out.println("MRI Fee: 8000");                            //Method Overloading
    }
    
    @Override
    public void cityscan(){
        System.out.println("City-Scan Added");
        this.fee+=4500;
    }
    public void cityscan(int n){
        System.out.println("City-Scan Fee: 4500");                      //Method Overloading
    }
    
    
    
    public void totalfee(){
        System.out.println("Total Fee: "+this.fee);
    }
    
    
    private int discount;
    public void setDiscount(int pdiscount){
       this.discount=pdiscount;
       fee=fee-(fee*discount)/100; 
    }                                                                        //Encapsulation
    
    public void getDiscount(){
        System.out.println("Final Fee(With Discount): "+fee);
    }
}
