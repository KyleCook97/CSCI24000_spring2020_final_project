//Fish.java

public class Fish extends Critter
{
    private String size;

    Fish()
    {

    }//end default constructor

    Fish(int id, String Name, String Location, String Size, int Price, String tod, String toy, boolean Caught)
    {
        ID = id;
        name = Name;
        location = Location;
        size = Size;
        price = Price;
        ToD = tod;
        ToY = toy;
        caught = Caught;
    }//end overloaded constructor

    public String getSize()
    {
        return size;
    }//end getSize()
}//end class def