package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private long phone;
    private int age;

    public String getTitle(){return title;}

    public Passenger(String title, String name, String id,long phone,int age)
    {
        setTitle(title);
    }

   public void setTitle(String title){
        if (title == "Mr" || title == "Mrs"|| title=="Ms"){
            this.title= title;
        }
        else
        {
            throw new IllegalArgumentException("Invalid title provided");
        }
   }
}
