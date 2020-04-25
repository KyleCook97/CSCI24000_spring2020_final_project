//Criter.java

abstract class Critter
{
    protected int ID;
    protected String name;
    protected String location;
    protected int price;
    protected String ToD;
    protected String ToY;
    protected boolean caught;

    Critter()
    {

    }//end default constructor

    Critter(int id, String Name, String Location, int Price, String tod, String toy, boolean Caught)
    {
        ID = id;
        name = Name;
        location = Location;
        price = Price;
        ToD = tod;
        ToY = toy;
        caught = Caught;
    }//end overloaded constructor

    public String getName()
    {
        return name;
    }//end getName()

    public String getLoc()
    {
        return location;
    }//end getLoc()

    public int getPrice()
    {
        return price;
    }//end getPrice()

    public String getToD()
    {
        return ToD;
    }//end getToD()

    public String getToY()
    {
        return ToY;
    }//end getToY()

    public boolean getCaught()
    {
        return caught;
    }//end getCaught()

    public void setCaught(boolean Caught)
    {
        caught = Caught;
    }//end setCaught()
}//end class def