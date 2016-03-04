# Electronic Life: Java Edition
​
## Project Goals
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
## Create the following
​
### Entity class
  - Is an abstract class
  - Has a field named size of type String
    - String "large" or "small" as possible values.
    - Bonus: enum for size field.
  - Has a field named isDead of type boolean.
  - Has a field named isSleeping of type boolean.
  - Has a field named weight of type int.
  - Has a method eat().
    - Has one parameter of type Entity
    - Increases weight by 1/10th weight of Eaten entity.
    - Eaten entity dies.
  - Has a method sleep.
    - Sets isSleeping to true;
  - Has a method poop.
    - Decreases weight by 1/10th.
    - If weight is zero Entity dies.
  - Has a method act.
    - Does nothing if isDead.
    - Does nothing if isSleeping.
    - If isSleeping it has of 50% chance of waking up.
    - Randomly will either eat(), sleep() or poop();
  - Has a method die.
    - set isDead to true.
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