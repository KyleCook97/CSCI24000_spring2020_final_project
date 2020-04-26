//Menu.java

import java.util.Scanner;
import java.util.ArrayList;

public class Menu
{
    Menu()
    {

    }//end constructor

    public void displayFish(ArrayList<Fish> fishArray)
    {
        for (int i = 0; i < fishArray.size(); i++)
        {
            System.out.println(fishArray.get(i).getID() + ". " + fishArray.get(i).getName() + " " + fishArray.get(i).getLoc() + " " + fishArray.get(i).getPrice() + " " + fishArray.get(i).getSize() + " " + fishArray.get(i).getToD() + " " + fishArray.get(i).getToY() + " " + fishArray.get(i).getCaughtStatus());
        }
    }//end displayFish()

    public void displayBugs(ArrayList<Bug> bugArray)
    {
        for (int i = 0; i < bugArray.size(); i++)
        {
            System.out.println(bugArray.get(i).getID() + ". " + bugArray.get(i).getName() + " " + bugArray.get(i).getLoc() + " " + bugArray.get(i).getPrice() + " " + bugArray.get(i).getToD() + " " + bugArray.get(i).getToY() + " " + bugArray.get(i).getCaughtStatus());
        }
    }//end displayBugs()

    public void displayCaughtFish(ArrayList<Fish> fishArray)
    {
        ArrayList<Fish> cFishArr = new ArrayList<>();

        for (int i = 0; i < fishArray.size(); i++)
        {
            if (fishArray.get(i).getCaught() == true)
            {
                cFishArr.add(fishArray.get(i));
            }
        }

        for (int k = 0; k < cFishArr.size(); k++)
        {
            System.out.println(cFishArr.get(k).getID() + ". " + cFishArr.get(k).getName());
        }

    }//end displayCaughtFish()

    public void displayCaughtBugs(ArrayList<Bug> bugArray)
    {
        ArrayList<Bug> cBugArr = new ArrayList<>();

        for (int i = 0; i < bugArray.size(); i++)
        {
            if (bugArray.get(i).getCaught() == true)
            {
                cBugArr.add(bugArray.get(i));
            }
        }

        for (int k = 0; k < cBugArr.size(); k++)
        {
            System.out.println(cBugArr.get(k).getID() + ". " + cBugArr.get(k).getName());
        }

    }//end displayCaughtBug()

    public void run(ArrayList<Bug> bugArray, ArrayList<Fish> fishArray)
    {
        boolean caught = true;
        boolean keepGoing = true;
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your Animal Crossing: New Horizons Critterpedia!!");

        while (keepGoing)
        {
            System.out.println("|------------------------------|");
            System.out.println("| Please make a selection:     |");
            System.out.println("| 1.) Display ALL Critters     |");
            System.out.println("| 2.) Display Bugs             |");
            System.out.println("| 3.) Display Fish             |");
            System.out.println("| 4.) Display Caught Fish      |");
            System.out.println("| 5.) Catch Fish               |");
            System.out.println("| 6.) Display Caught Bugs      |");
            System.out.println("| 7.) Catch Bug                |");
            System.out.println("| 8.) Exit                     |");
            System.out.println("|------------------------------|");

            selection = input.nextInt();

            if (selection == 1)
            {
                displayBugs(bugArray);
                System.out.println("------------------------------");
                displayFish(fishArray);
            }
            else if (selection == 2)
            {
                displayBugs(bugArray);
            }
            else if (selection == 3)
            {
                displayFish(fishArray);
            }
            else if (selection == 4)
            {
                displayCaughtFish(fishArray);
            }
            else if (selection == 5)
            {
                System.out.print("Enter the ID number of the Fish you would like to catch: ");
                selection = input.nextInt();
                fishArray.get(selection - 1).setCaught(caught);

                System.out.println("Caught: " + fishArray.get(selection - 1).getName());
            }
            else if (selection == 6)
            {
                displayCaughtBugs(bugArray);
            }
            else if (selection == 7)
            {
                System.out.print("Enter the ID number of the Bug you would like to catch: ");
                selection = input.nextInt();
                bugArray.get(selection - 1).setCaught(caught);

                System.out.println("Caught: " + bugArray.get(selection - 1).getName());
            }
            else if (selection == 8)
            {
                System.out.println("Exiting...");
                keepGoing = false;
            }
        }//end while
    }//end run()
}//end calss def