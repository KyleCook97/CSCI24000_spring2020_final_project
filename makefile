Driver.class: Driver.java Critter.class Bug.class Fish.class
	javac -g Driver.java

Critter.class: Critter.java
	javac -g Critter.java

Bug.class: Bug.java Critter.class
	javac -g Bug.java

Fish.class: Fish.java Critter.class
	javac -g Fish.java

Menu.class: Menu.java
	javac -g Menu.java
	
clean:
	rm *.class

run: Driver.class
	java Driver