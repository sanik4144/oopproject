import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);               //Scanner Class
        System.out.println("Do you want Special Doctor?");
        System.out.println("If Yes, Press 1");
        System.out.println("If No, Press 0");
        int spd=scan.nextInt();
        
        int n,i;
        
        System.out.print("Enter the number of Patients: ");
        n=scan.nextInt();
        
        try{
        ArrayList<Doctor> ptnt=new ArrayList<>();                        //Array List
        }
        catch(Exception e){
            System.out.println("e");
        }
        
        Doctor[] ptnt=new Doctor[n];
        Medicine[] med=new Medicine[n];                                    //Array of Object
        for(i=0; i<n; i++){
        if(spd==1){
        
            
            ptnt[i]=new Doctor(true,true);
            System.out.println("Enter 1 to see all the fees else enter 0");
            int ch,pricecheck=scan.nextInt();
            if(pricecheck==1){
                System.out.println("Enter 1 to see Urine Test Fee");
                System.out.println("Enter 2 to see Blood Test Fee");
                System.out.println("Enter 3 to see X-Ray Fee");
                System.out.println("Enter 4 to see MRI Fee");
                System.out.println("Enter 5 to see City-Scan Fee");
                System.out.println("Enter 0 to Proceed");

            do {
                ch=scan.nextInt();
                switch (ch) {
                    case 1 -> ptnt[i].urinetest(1);
                    case 2 -> ptnt[i].bloodtest(1);
                    case 3 -> ptnt[i].xray(1);
                    case 4 -> ptnt[i].MRI(1);
                    case 5 -> ptnt[i].cityscan(1);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (ch!= 0);
            }


            int choice;
                System.out.println("Enter 1 to add Urine Test");
                System.out.println("Enter 2 to add Blood Test");
                System.out.println("Enter 3 to add X-Ray");
                System.out.println("Enter 4 to add MRI");
                System.out.println("Enter 5 to add City-Scan");
                System.out.println("Enter 0 to Proceed");

            do {
                choice=scan.nextInt();
                switch (choice) {
                    case 1 -> ptnt[i].urinetest();
                    case 2 -> ptnt[i].bloodtest();
                    case 3 -> ptnt[i].xray();
                    case 4 -> ptnt[i].MRI();
                    case 5 -> ptnt[i].cityscan();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);

            ptnt[i].totalfee();

            System.out.print("Enter the percentage of discount: ");
            int d=scan.nextInt();
            ptnt[i].setDiscount(d);
            ptnt[i].getDiscount();
            
            
            
            
            
            System.out.println("Enter 1 to add medicine else 0");
        int m=scan.nextInt();
        
        if(m==1){
            med[i]=new Medicine();           //Has-A Relationship
        
            med[i].welcome();
            System.out.println("Enter 1 to see all the Mediceine fees else enter 0");
            int mch,mpricecheck=scan.nextInt();
            if(mpricecheck==1){
                System.out.println("Enter 1 to see Paracitamol Fee");
                System.out.println("Enter 2 to see Ibuprofen Fee");
                System.out.println("Enter 3 to see Antihistamine Fee");
                System.out.println("Enter 4 to see Antidiarrhoea Fee");
                System.out.println("Enter 5 to see Moisturiser Fee");
                System.out.println("Enter 0 to Proceed");

            do {
                mch=scan.nextInt();
                switch (mch) {
                    case 1 -> med[i].paracitamol(1);
                    case 2 -> med[i].ibuprofen(1);
                    case 3 -> med[i].antihistamine(1);
                    case 4 -> med[i].antidiarrhoea(1);
                    case 5 -> med[i].moisturiser(1);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (mch!= 0);
            }


            int mchoice;
                System.out.println("Enter 1 to add Paracitamol");
                System.out.println("Enter 2 to add Ibuprofen");
                System.out.println("Enter 3 to add Antihistamine");
                System.out.println("Enter 4 to add Antidiarrhoea");
                System.out.println("Enter 5 to add Moisturiser");
                System.out.println("Enter 0 to Proceed");

            do {
                mchoice=scan.nextInt();
                switch (mchoice) {
                    case 1 -> med[i].paracitamol();
                    case 2 -> med[i].ibuprofen();
                    case 3 -> med[i].antihistamine();
                    case 4 -> med[i].antidiarrhoea();
                    case 5 -> med[i].moisturiser();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (mchoice != 0);

            med[i].totalfee();                                                  //Method Overriding
        }
        else if(m==0){
            System.out.println("No Medicine Added");
        }
        }
        
        else if(spd==0){
            ptnt[i]=new Doctor(true);            
        
            System.out.println("Enter 1 to see all the fees else enter 0");
            int ch,pricecheck=scan.nextInt();
            if(pricecheck==1){
                System.out.println("Enter 1 to see Urine Test Fee");
                System.out.println("Enter 2 to see Blood Test Fee");
                System.out.println("Enter 3 to see X-Ray Fee");
                System.out.println("Enter 4 to see MRI Fee");
                System.out.println("Enter 5 to see City-Scan Fee");
                System.out.println("Enter 0 to Proceed");

            do {
                ch=scan.nextInt();
                switch (ch) {
                    case 1 -> ptnt[i].urinetest(1);
                    case 2 -> ptnt[i].bloodtest(1);
                    case 3 -> ptnt[i].xray(1);
                    case 4 -> ptnt[i].MRI(1);
                    case 5 -> ptnt[i].cityscan(1);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (ch!= 0);
        }


            int choice;
                System.out.println("Enter 1 to add Urine Test");
                System.out.println("Enter 2 to add Blood Test");
                System.out.println("Enter 3 to add X-Ray");
                System.out.println("Enter 4 to add MRI");
                System.out.println("Enter 5 to add City-Scan");
                System.out.println("Enter 0 to Proceed");

            do {
                choice=scan.nextInt();
                switch (choice) {
                    case 1 -> ptnt[i].urinetest();
                    case 2 -> ptnt[i].bloodtest();
                    case 3 -> ptnt[i].xray();
                    case 4 -> ptnt[i].MRI();
                    case 5 -> ptnt[i].cityscan();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);

            ptnt[i].totalfee();

            System.out.print("Enter the percentage of discount: ");
            int d=scan.nextInt();
            ptnt[i].setDiscount(d);
            ptnt[i].getDiscount();
        
            System.out.println("Enter 1 to add medicine else 0");
        int m=scan.nextInt();
        
        if(m==1){
            med[i]=new Medicine();           //Has-A Relationship
        
            med[i].welcome();
            System.out.println("Enter 1 to see all the Mediceine fees else enter 0");
            int mch,mpricecheck=scan.nextInt();
            if(mpricecheck==1){
                System.out.println("Enter 1 to see Paracitamol Fee");
                System.out.println("Enter 2 to see Ibuprofen Fee");
                System.out.println("Enter 3 to see Antihistamine Fee");
                System.out.println("Enter 4 to see Antidiarrhoea Fee");
                System.out.println("Enter 5 to see Moisturiser Fee");
                System.out.println("Enter 0 to Proceed");

            do {
                mch=scan.nextInt();
                switch (mch) {
                    case 1 -> med[i].paracitamol(1);
                    case 2 -> med[i].ibuprofen(1);
                    case 3 -> med[i].antihistamine(1);
                    case 4 -> med[i].antidiarrhoea(1);
                    case 5 -> med[i].moisturiser(1);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (mch!= 0);
            }


            int mchoice;
                System.out.println("Enter 1 to add Paracitamol");
                System.out.println("Enter 2 to add Ibuprofen");
                System.out.println("Enter 3 to add Antihistamine");
                System.out.println("Enter 4 to add Antidiarrhoea");
                System.out.println("Enter 5 to add Moisturiser");
                System.out.println("Enter 0 to Proceed");

            do {
                mchoice=scan.nextInt();
                switch (mchoice) {
                    case 1 -> med[i].paracitamol();
                    case 2 -> med[i].ibuprofen();
                    case 3 -> med[i].antihistamine();
                    case 4 -> med[i].antidiarrhoea();
                    case 5 -> med[i].moisturiser();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (mchoice != 0);

            med[i].totalfee();                                                  //Method Overriding
        }
        else if(m==0){
            System.out.println("No Medicine Added");
        }
            
        }
        }
    }
}
