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
        int tempPrice = 100;
        String tempToD = "Time";
        String tempToY = "Months";
        boolean tempCaught = false;

        boolean keepGoing = true;
        int selection;

        ArrayList<Bug> bugArr = new ArrayList<>();
        ArrayList<Fish> fishArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Menu m = new Menu();

        System.out.println("Loading Files..." + "\n");
        try
        {
            File bugInFile = new File("bugs.txt");
            Scanner bugRead = new Scanner(bugInFile);

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
                    tempToY = bugRead.next();
                
                if (bugRead.hasNextBoolean())
                    tempCaught = bugRead.nextBoolean();

                bugRead.nextLine();
                bugArr.add(new Bug(tempID, tempName, tempLoc, tempPrice, tempToD, tempToY, tempCaught));
            }//end while
        }//end try
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred when reading the file." + "\n");
            e.printStackTrace();
        }//end catch

        try
        {
            File fishInFile = new File("fish.txt");
            Scanner fishRead = new Scanner(fishInFile);

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
                    tempToY = fishRead.next();
                
                if (fishRead.hasNextBoolean())
                    tempCaught = fishRead.nextBoolean();

                fishRead.nextLine();
                fishArr.add(new Fish(tempID, tempName, tempLoc, tempSize, tempPrice, tempToD, tempToY, tempCaught));
            }//end while
        }//end try
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred when reading the file." + "\n");
            e.printStackTrace();
        }//end catch

        m.run(bugArr, fishArr);

        try
        {
            FileWriter bugOutFile = new FileWriter("bugs.txt");
            for (int i = 0; i < bugArr.size(); i++)
            {
                bugOutFile.write(bugArr.get(i).getID() + "," + bugArr.get(i).getName() + "," + bugArr.get(i).getLoc() + "," + bugArr.get(i).getPrice() + "," + bugArr.get(i).getToD() + "," + bugArr.get(i).getToY() + "," + bugArr.get(i).getCaught() + "," + "\n");
            }
            bugOutFile.close();
            System.out.println("Successfully wrote to the bug file.");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try
        {
            FileWriter fishOutFile = new FileWriter("fish.txt");
            for (int i = 0; i < fishArr.size(); i++)
            {
                fishOutFile.write(fishArr.get(i).getID() + "," + fishArr.get(i).getName() + "," + fishArr.get(i).getLoc() + "," + fishArr.get(i).getSize() + "," + fishArr.get(i).getPrice() + "," + fishArr.get(i).getToD() + "," + fishArr.get(i).getToY() + "," + fishArr.get(i).getCaught() + "," + "\n");
            }
            fishOutFile.close();
            System.out.println("Successfully wrote to the fish file.");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }//end main
}//end class def