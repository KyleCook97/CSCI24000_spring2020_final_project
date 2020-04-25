//Bug.java

public class Bug extends Critter
{
    Bug()
    {

    }//end default constructor

    Bug(int id, String Name, String Location, int Price, String tod, String toy, boolean Caught)
    {
        ID = id;
        name = Name;
        location = Location;
        price = Price;
        ToD = tod;
        ToY = toy;
        caught = Caught;
    }//end overloaded constructor
}//end class def