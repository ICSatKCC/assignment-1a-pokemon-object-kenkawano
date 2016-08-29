# Assignment1a-Pokemon-Object

Create a simple Pokemon object class. We are going to use this most of the semester so make a good start!

There will be 7 instance variables
  * String name
  * String nickName
  * int number
  * String type1
  * String type2
  * int HP
  * int CP
  
These variables represent the fields that are stored in the Pokemon Go game. name will be used for the "official" name, like Bulbasaur or Pikachu. The nickName is for a user-defined name. The number will be the official Pokemon number out of the Pokedex. The types will be Pokemon types like water, fire, flying, etc. HP is the "hit points" and CP is the "combat power"

There should be two constructors.
 1. Takes in 5 parameters: name, nickName, number, type1, type2
 2. Takes in 4 parameters: name, number, type1, type2
  * This constructor should set the nickName to the same as the name 
  
The HP and CP should be set automatically when a Pokemon object is initialized. 
 * The HP should be a random int between 10 and 150 inclusive.
 * CP is a little harder.
  * Make a **double** multiplier that is between Min=1.00 and Max=3.00
  * *hint:*  ```multiplier = Min + (Max - Min)*randGen.nextDouble();```
  * CP is then HP * multiplier typecasted to an int
  
There should be a complete set of Gets methods for all instance variables. However, only the nickName should have a public Set method.

There should be a public powerUp method that increases the HP and CP. The new HP should be set with this formula:
 * HP = oldHP + 1.15 + (0.2 * oldHP)
 * The new CP is set using the same formula as it is set with initially, **BUT** it shouldn't be reset if that value ends up to be less than the current CP.
  
Finally, there should be a toString method that returns a String in this form:
```
Name: <Pokemon name>
Nickname: <Pokemon nickName>
Number: <number>
Type: <type1> | <type2>
HP: <HP>
CP: <CP>
```
  
