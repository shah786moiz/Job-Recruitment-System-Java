
package newpackage;
public class Job {
    public static Job[] job=new Job[8]; //Creating array Object  and Setting size
    public static   int counter=3;
    int jobID;
    public String title;
    public String description;
    public String qualification;
    public String location;
    public int salary;
    public Job(int jobID, String title, String description, String qualification, String location, int salary){
    this.jobID=jobID;
    this.title=title;
    this.description=description;
    this.qualification=qualification;
    this.location=location;
    this.salary=salary;
    }
//    Job() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    //----------Getters----------
      public int getJobId(){
        return this.jobID;
    }
     public String getJobTitle(){
        return this.title;
    }
     public String getJobQualification(){
        return this.qualification;
    }
     public String getJobLocation(){
        return this.location;
    }
     public int getSalary(){
        return this.salary;
    }
     public String getJobDescription(){
         return this.qualification;
     }
     //-------------Setters------------
     public void setId(int jobID){
         this.jobID=jobID;
     }
      public void setJobTitle(String title){
         this.title=title;
     }
      public void setJobQualification(String qualification){
          this.qualification=qualification;
      }
       public void setDescription(String description){
         this.description=description;
     }
        public void setLocation(String location){
         this.location=location;
     }
         public void setSalary(int salary){
         this.salary=salary;
         }         
}