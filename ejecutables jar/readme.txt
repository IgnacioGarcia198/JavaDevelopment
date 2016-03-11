How to run this programs:
eco.jar and Celulas.jar have graphic interface, so it is possible to open them directly if Java is already installed.
coyotes.jar and garrafas9.2.jar are in text mode. To use them it is possible to enter java -jar <jar file name>. With cmd in Windows and Terminal in Linux.Do not forget to write the file route before the name.

celulas.jar works rather well with some small bug, though. It is a graphic version with fish-cells of the "game of life".
eco.jar is part of a bigger project and only the interface is made so far. For this interface to work you will need some image whenever a new species is created. A form will appear asking for it. 

garrafas9.2.jar is a text version of the famous "jugs problem" (in spanish, "el problema de las garrafas". It uses search in graphs with an algorithm resembling "Branch and Bound". It can be notably improved making the algorithm an "iterative deepening" one. A normal value for the initial deep limit ("cota inicial") could be 20. I do not recommend using more than 4 jugs because it can become quite slow.

coyotes.jar is a simulation game of a "meadow" containing several species hunting all each other, depending on the "joint strenght" of grouped animals. It is possible to add animals, remove them, etc. in game-time. Whenever an animal eats other one of different species, the predator's strenght increases as well as the other coyotes in its group. 


Any doubt find me in ignaciogarcia198@gmail.com. Greetings.
