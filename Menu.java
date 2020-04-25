//Menu.java

import java.util.ArrayList;

public class Menu
{
    ArrayList<Bug> menuBugArr = new ArrayList<>();
    ArrayList<Fish> menuFishArr = new ArrayList<>();

    Menu()
    {

    }//end constructor

    Menu(ArrayList<Bug> bugArray, ArrayList<Fish> fishArray)
    {
        menuBugArr = bugArray;
        menuFishArr = fishArray;
    }
}//end calss def