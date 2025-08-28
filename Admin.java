
package newpackage;
import java.util.Scanner;
import static newpackage.Job.job; 
import static newpackage.Job.counter; 
    public class Admin extends User 
    {
    public Admin(String userName, int password, int ID)
    {
       super(userName, password,ID);
    }
    Scanner input = new Scanner(System.in); //Input krwanay kay liya
    public void addJobs(){
        System.out.println("Enter JOb ID: ");
        int jobID=input.nextInt();
        System.out.println("Enter Title of Job: ");
         input.nextLine();
        String title = input.nextLine();
        input.nextLine();
        System.out.println("Enter Job Description: ");
        String description = input.nextLine();
        System.out.println("Enter the Qualification Required for the Job: ");
        String qualification=input.nextLine();
        System.out.println("Enter the Location for the Job: ");
        String location = input.nextLine();
        System.out.println("Enter Salary for the Job: ");
        int salary = input.nextInt();
     
        
        Job.job[counter++]=new Job(jobID,title,description,qualification,location,salary);
    }
    @Override
     public void viewJob(){
             for(int i=0; i<counter;i++)
             {
             System.out.println("Job ID is: "+job[i].jobID);
             System.out.println("Job Title is: "+job[i].title);
             System.out.println("Job Description is: "+job[i].description);
             System.out.println("Salary for the Job is: "+job[i].salary);
             System.out.println("Location of Job is: "+job[i].location);
             }
     }
     public void deleteJob(){
         viewJob();
         System.out.println("Enter the ID of Job You want to Delete: ");
         int ID = input.nextInt();
         for(int i=0; i<=counter; i++){
         if(job[i].getJobId()==ID)
         {
            --counter;
            
         }
         else
             {
                System.out.println("No ID Found");   
             }
         }
    }
     public void updateJob(){
         System.out.println("Enter the ID you want to Update Details");
         int ID = input.nextInt();
         for(int i=0; i<=counter; i++){
         if(job[i].getJobId()==ID){
             System.out.println("Enter Updated Qualification");
             String qualification = input.nextLine();
            input.nextLine();
             System.out.println("Enter Updated Job Location");
             String location = input.nextLine();
             System.out.println("Enter Updated Job Salary");
             int salary = input.nextInt();
             System.out.println("Job Updated Successfully");
             job[i].qualification=qualification;
             job[i].location=location;
             job[i].salary=salary;
         }
         }
             }
     }