# Goals
​
- Use Inheritance
- Use polymorphism
  - overloading
  - overriding
- Use Encapsulation / abstraction
  - make everything private that you can
  - if you cant make it private make it protected
  - otherwise, only if it has to be, make it public
  - use getters where needed
  - use setters where needed
​
# Create the following
​
abstract Entity class
  -has field size, large or small
  - has field isDead
  - has a field isSleeping boolean.
  - has a field weight that is an int.
  - has an abstract method eat().
    - takes in entity as param
    - increases weight by 1/10th weight of entity eaten
    - other entity eaten dies.
  - has an abstract method sleep.
    - sets sleep to true;
  - has an abstract method poop.
    - weight decreases by 1
  - has an abstract method act.
    - cant act if dead
    - if isSleeping 50% chance of waking up.
    - doesn't do anything if it is sleeping
    - randomly will either eat, sleep or poop;
  - has an abstract method die.
    - set isdead to true
​
abstract class cat subclasses entity
abstract class dog subclasses entity
abstract class fish subclasses entity
​
​
rotweiler subclasses dog
  - large
  - eat small cats.
  - eat small fish.
​
weiner subclass dog.
  - small
  - eats small fish.
​
persian subclasses cat
  -small
  - eats small fish
  - has method called annoy
    - returns void
    - takes in entity as parameter
​
lion subclasses cat
  - large
  - eats all fish, all dogs, all cats that aren't lions
  - is 3x more likely to sleep
​
goldfish subclass fish
  -small
  - it overloads eat to take in string, e.g. "algae"
  - it is 3x as likely to poop than sleep
  - it is 3x as likely to eat than sleep.
​
piranha subclass fish
  - large
  - eats everything besides piranhas
  - it is more likely to eat than anything else.