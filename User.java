
package newpackage;
   public abstract class User
   {
    protected String userName;
    protected int password;
    protected int ID;
    public User(String userName, int password, int ID) {
        this.userName = userName;
        this.password = password;
        this.ID=ID;
    }
    //Yeh walay Methods child class mein inherit ho kr implement hongay
    public abstract void viewJob();
    public String getUsername(String userName)
    { 
       return this.userName;
    }
    public int getPassword( int password)
    {
        return this.password; 
    }
    public int getID()
    {
       return this.ID;
    }
     public void setUsername(String userName)
    {
        this.userName=userName;
    }
      public void setPassword(int password)
    {
       this.password=password;
    }
       public void setID(int ID)
    {
       this.ID=ID;
    }
   }