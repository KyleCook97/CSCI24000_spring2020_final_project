Driver.class: Driver.java Critter.class Bug.class Fish.class
	javac -g Diver.java

Critter.class: Critter.java
	javac -g Critter.java

Bug.class: Bug.java Critter.class
	javac -g Bug.java

Fish.class: Fish.java Critter.class
	javac -g Fish.java

clean:
	rm * .class

run: Driver.class
	java Driver