# Animal Crossing Critterpedia Helper

## Kyle Cook, CSCI 24000

### Project Summary

The purpose of this program is to help players of the game "Animal Crossing: New Horizons" keep track and find the various wildlife in the game. It will allow users to look up certain critters by whether they are a fish or a bug. From there they can look up more specifics such as location, time of day, time of year or whether they have been caught already or not.

Intended user: Players of Animal Crossing

Issue to solve: A way to allow users to find out when and where they can find a certain bug or fish

Tech: data file with complete list of all catchable critter

#### Critter Classes
    - A Critter can be 1 of 2 types either a fish or a bug
    - A fish will also have a size ranging from 1-5 (1 being extra small and 5 being extra large)

#### Menu Class
    - The purpose of this class is to let users search for a specfic critter by location, time of day, etc.

### Use Cases

There will only be one use case for this program: A user can search for a critter and all of its info and allow the user to list whether they have caught or not caught the critter.

### Data Design

This project uses multiple object-oriented concepts. There are a total of 4 differnet classes that and will be done in the command line.
    - Inheritence: Two classes will inherit from the Critter class
    - Encapsulation: All data members are only accesible through methods
    - Polymorphism: Critter has abstract methods such as getInfo that will be implemented in the inherited classes
    - Abstraction: Critter is an abstract class to be inherited from

The data will be stored as objects (i.e. fish) and will have attributes tied to them.
To keep track of whether the user has caught the critter the data will be stored in an external file that will be loaded at the start of runtime and be written to before the program terminates.