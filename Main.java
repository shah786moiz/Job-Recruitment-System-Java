
package newpackage;
import java.util.Scanner;
import static newpackage.Job.counter;
import static newpackage.Job.job;
public class Main {   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {       
         Job.job[0]=new Job(1, "SOFTWARE ENGINEER", "A WELL EDUCATED ENGINEER REQUIRED", "MS in CS", "ISLAMABAD", 100500);
         Job.job[1]=new Job(2, "IT SPECIALIST", "A WELL EDUCATED IT SPECIALIST REQUIRED", "MS in IT", "RAWALPINDI", 140000);
         Job.job[2]=new Job(3, "CYBER SECURITY MANAGER", "A WELL EDUCATED CYBER SECURITY MANAGER REQUIRED", "MS in CYBER SECURITY", "KARACHI", 55000);
         Scanner scanner = new Scanner(System.in);
         //(String userName,int password, int ID,String qualification,String Address, String eMail)
         Applicant.applicant[0]=new Applicant("Moiz",0,64854,"BS CS","ISLAMABAD","shah786moiz@gmail.com");
         Applicant.applicant[1]=new Applicant("Hussnain",0,64872,"BS SE","KARACHI","shahHussnain56@gmail.com");
         Applicant.applicant[2]=new Applicant("HASSAN",0,64874,"BS CYBER SECURITY","LAHORE","shahHassan009@gmail.com");
        int ApplChoice = 0;
        int adminPassword = 0;
        int UserPassword = 0;
        int choice = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;        
        System.out.println("\t\tWelcome To Our Organization In Which we are Offering The Jobs");
        do {
            System.out.println("1-\tAdministrator End");
            System.out.println("2-\tEnter as User");
            System.out.println("3-\tExit");
            System.out.print("Enter choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                     adminPassword = 1111;
                    System.out.print("Enter Your Password:");
                     adminPassword = scanner.nextInt();
                    if ( adminPassword == 1111) {
                        do{
                        System.out.println("Congratulations you are successfully logged in");
                        System.out.println("1-\tADD Jobs");
                        System.out.println("2-\tDISPLAY JOBS");
                        System.out.println("3-\tVIEW APPLICATION STATUS");
                        System.out.println("4-\tDELETE A JOB");
                        System.out.println("5-\tUPDATE A JOB");
                        System.out.print("Enter choice:");
                        choice3 = scanner.nextInt();
                        
                        switch (choice3) {
                            case 1:
                                Admin admin = new Admin("",0,0);
                                admin.addJobs();
                                break;
                            case 2:
                                 Admin adm = new Admin("",0,0);
                                 adm.viewJob();
                                break;
                            case 3:
                                System.out.println("\t1-For Viewing Status\n\t2-For Viewing Applicants CV");
                                ApplChoice = scanner.nextInt();
                                switch (ApplChoice) {
                                    case 1:
                                        Applicant app1 = new Applicant("",0,0,"","","");
                                        app1.applicantStatus();
                                        break;
                                    case 2:
                                        Applicant app = new Applicant("",0,0,"","","");
                                        app.displayCV();
                                        break;
                                    default:
                                        System.out.println("Invalid Entry");
                                        break;
                                }
                                break;
                            case 4:
                                Admin ad = new Admin("",0,0);
                                ad.viewJob();
                                System.out.println();
                                ad.deleteJob();
                                System.out.println("Job Deleted Successfully");
                                break;
                            default:
                                System.out.println("wrong choice");
                                break;
                            case 5: 
                                Admin ad1 = new Admin("",0,0);
                                ad1.viewJob();
                                ad1.updateJob();
                                break;
                        }
                        System.out.println("Press 6 for Exit and Something else for continue");   
                        choice3=scanner.nextInt();
                        }while(choice3!=6);
                    }
              
                    else{
                        System.out.println("incorrect password");
                    }
                    break;
                case 2:
                    UserPassword = 1234;
                    System.out.print("Enter Your Password:");
                    UserPassword = scanner.nextInt();
                    if (UserPassword == 1234) {
                        do{
                        System.out.println("\t\tCongratulations you are successfully logged in");
                        System.out.println("1-\tView Jobs");
                        System.out.println("2-\tUpload Your CV");
                        System.out.println("3-\tApply For a Job");
                        System.out.print("Enter choice:");
                        choice4 = scanner.nextInt();
                        
                        switch (choice4) {
                            case 1:
                               Admin ad3=new Admin("",0,0);
                               ad3.viewJob();
                                break;
                            case 2:
                                Applicant applicant1 =new Applicant("",0,0,"","","");
                                applicant1.writeCV();
                                break;
                            case 3:
                                Scanner sc = new Scanner(System.in);
                                System.out.println("We have the Following Jobs Avaialabe");
                                Admin ad4 = new Admin("",0,0);
                                ad4.viewJob();
                                System.out.println("Enter the ID of Job you want");
                                int id = sc.nextInt();
                                 Applicant applicant2 =new Applicant("",0,0,"","","");
                                 applicant2.applyJob(id);
                                break;
                                 case 4:
                                System.out.println("Exit");
                                break;
                                default:
                                System.out.println("wrong choice");
                                break;
                        }
                        System.out.println("Press 4 for Exit and Something else for continue");   
                        choice4=scanner.nextInt();
                    }while(choice4!=4);
                    }
                    else 
                        System.out.println("incorrect password");
                        
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
            System.out.println("Enter 3 for exit and else anything for continue:");
            choice2 = scanner.nextInt();
        } while (choice2 != 3);
        
        scanner.close();
}
}