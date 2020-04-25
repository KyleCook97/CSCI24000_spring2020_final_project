//Driver.java

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

abstract class Driver
{
    public static void main(String args[])
    {
        int tempID = 0;
        String tempName = "Name";
        String tempLoc = "Place";
        String tempSize = "Size";
        int tempPrice = "0";
        String tempToD = "Time";
        String tempToY = "Months";
        boolean tempCaught = false;

        boolean keepGoing = true;
        int selection;

        ArrayList<Bug> bugArr = new ArrayList<>();
        ArrayList<Fish> fishArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Loading Files..." + "\n");
        try
        {
            File bugFile = new File("bugs.txt");
            Scanner bugRead = new Scanner(bugFile);

            bugRead.useDelimiter(",");
            while (bugRead.hasNext())
            {
                if (bugRead.hasNextInt())
                    tempID = bugRead.nextInt();

                if (bugRead.hasNext())
                    tempName = bugRead.next();

                if (bugRead.hasNext())
                    tempLoc = bugRead.next();

                if (bugRead.hasNextInt())
                    tempPrice = bugRead.nextInt();

                if (bugRead.hasNext())
                    tempToD = bugRead.next();

                if (bugRead.hasNext())
                    tempToD = bugRead.next();
                
                if (bugRead.hasNextBoolean())
                    tempCaught = bugRead.nextBoolean();

                bugArr.add(new Bug(tempID, tempName, tempLoc, tempPrice, tempToD, tempToY, tempCaught))
            }//end while
        }//end try
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred when reading the file." + "\n");
            e.printStackTrace();
        }//end catch

        try
        {
            File fishFile = new File("fish.txt");
            Scanner fishRead = new Scanner(fishFile);

            fishRead.useDelimiter(",");
            while (fishRead.hasNext())
            {
                if (fishRead.hasNextInt())
                    tempID = fishRead.nextInt();

                if (fishRead.hasNext())
                    tempName = fishRead.next();

                if (fishRead.hasNext())
                    tempLoc = fishRead.next();

                if (fishRead.hasNext())
                    tempSize = fishRead.next();

                if (fishRead.hasNextInt())
                    tempPrice = fishRead.nextInt();

                if (fishRead.hasNext())
                    tempToD = fishRead.next();

                if (fishRead.hasNext())
                    tempToD = fishRead.next();
                
                if (fishRead.hasNextBoolean())
                    tempCaught = fishRead.nextBoolean();

                fishArr.add(new Fish(tempID, tempName, tempLoc, tempPrice, tempToD, tempToY, tempCaught))
            }//end while
        }//end try
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred when reading the file." + "\n");
            e.printStackTrace();
        }//end catch
    }//end main
}//end class def