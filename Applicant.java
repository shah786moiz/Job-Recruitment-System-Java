
package newpackage;
import java.util.Scanner;
import static newpackage.Job.job; 
import static newpackage.Job.counter;  
public class Applicant extends User {
    public static Applicant[] applicant = new Applicant[9];
   
    public boolean status;
    public String qualification;
    public String Address;
    public String eMail;
    public Applicant(String userName,int password, int ID,String qualification,String Address, String eMail){
        super(userName, password, ID);
        this.qualification=qualification;
        this.Address=Address;
        this.eMail=eMail;
    }
    //---------Getters------
    public String getQualification(){
        return this.qualification;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getEmail(){
        return this.eMail;
    }
    //--------Setters---------
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public void setEmail(String eMail){
        this.eMail=eMail;
    }
    @Override
     public void viewJob(){
         Admin ad2 = new Admin("",0,0);
         ad2.viewJob();
     }
    public static int count=3;
     public void writeCV(){
         Scanner s = new Scanner(System.in);
         System.out.println("Write Your Name: ");
         String name = s.nextLine();
         System.out.println("Write Your ID: ");
         int ID = s.nextInt();
         System.out.println("Write Your password: ");
         int password = s.nextInt();
         System.out.println("Write Your Qualification: ");
         String qualification = s.nextLine();
          s.nextLine();
         System.out.println("Write Your Address: ");
         String Address = s.nextLine();
         System.out.println("Write Your E-Mail Address: ");
         String eMail = s.nextLine();
          applicant[count++]=new Applicant(name,ID,password,qualification,Address,eMail);
}
     public void displayCV(){
       for(int i=0; i<count;i++){
           System.out.println("Name of Applicant is: "+applicant[i].userName);
           System.out.println("ID of Applicant is: "+applicant[i].ID);
           System.out.println("Qualification of Applicant is: "+applicant[i].qualification);
           System.out.println("The Candidate Lives in: "+applicant[i].Address);
           System.out.println("E-Mail Address of Applicant is: "+applicant[i].eMail);
       }
     }
      public void applicantStatus(){
         {
                 for(int i=0;i<counter; i++){
                   System.out.println("The Name of Applicant is: "+applicant[i].userName);
                   System.out.println("E-Mail Address of Applicant is: "+applicant[i].eMail);
                   System.out.println("Qualification of Applicant is: "+applicant[i].qualification);
                   System.out.println("Address of Applicant is: "+applicant[i].Address);
                  // System.out.println("Job Applied for is: "+job[i].title);
                   
             }
     }
     }
     public void applyJob(int id){
       for (int i = 0; i < count; i++) {
    if (job[i].getJobId() == id) {
        writeCV();
        System.out.println("Successfully Request Submitted");
        return;
    }
}
System.out.println("Invalid");
}
     
}
