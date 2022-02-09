package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private long phone;
    private int age;

    public String getTitle(){return title;}
    public String getName(){return name;}


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

   public void setName(String name){
        int l = name.length();
        if (l >= 3){
            this.name=name;
       }
        else
        {
            throw new IllegalArgumentException("Invalid Name provided");
        }
   }
}
