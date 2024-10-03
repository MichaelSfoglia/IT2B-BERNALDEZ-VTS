package classes;

import java.util.Scanner;

public class IT2BDEMOAPPDB {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int action;
        
        do {
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT\n");
            
            System.out.print("Enter action: ");
            action = sc.nextInt();
            
            IT2BDEMOAPPDB sample = new IT2BDEMOAPPDB();
            
            switch(action){
                case 1:
                    sample.addCitizens();
                    break;
                    
                case 2:
                    sample.viewCitizens();
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("");
            }
        } while(action != 5);
    }
    
        public void addCitizens(){
         Scanner sc = new Scanner(System.in);
        config conf = new config();
         System.out.print("First Name: ");
        String fname = sc.next();
        System.out.print("Last Name: ");
        String lname = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Status: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_citizens (fname, lname, email, status) VALUES (?, ?, ?, ?)";

        conf.addRecord(sql, fname, lname, email, status);
    }
        
        
            
    public void viewCitizens() {
         config conf = new config();
        String votersQuery = "SELECT * FROM tbl_citizens";
        String[] votersHeaders = {"ID", "First Name", "Last Name", "Email", "Status"};
        String[] votersColumns = {"ID", "fname", "lname", "email", "status"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
     
}
