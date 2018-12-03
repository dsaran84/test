## Solution

1. Can you implement the sing() method for the bird?
    * How did you unit test it?
    > - Implemented unit tests for methods in Bird class. 
    > - Refactored code to return String instead of printing 
    the results in order to improve ease of testing.
    * How did you optimize the code for maintainability?
    > - Converted Animal class to an interface as there are no
    common methods to be abstracted and there is no current 
    requirement to instantiate an object of class Animal.
    
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
   implement them to make their own special sound?
    * A duck says: “Quack, quack”
    * A duck can swim
    * A chicken says: “Cluck, cluck”
    * A chicken cannot fly (assumption: its wings are clipped but ignore that)
   > - Added two new classes - Duck and Chicken
   > - Override sing method to make sounds specific to these birds.
   >   - Assuming that bird sounds and bird singing is the same thing.
   > - Added swim method to Duck.
   >   - Swim method is currently specific to Duck. No need to extract into a separate interface.
   > - Added unit tests for Chicken and Duck.
   
3. Now how would you model a rooster?
    * A rooster says: “Cock-a-doodle-doo”
    * How is the rooster related to the chicken?
    * Can you think of other ways to model a rooster without using inheritance?
    > - Created a new Rooster class by extending Chicken class.
    >   - Assumption: Chicken refers to the species as a whole and Rooster is a type of Chicken.
    > - Rooster is a specific type of Chicken.
    > - Without Inheritance, we can create Rooster as a separate class that implements the Animal interface with 
    extra methods that's specific to Chickens/Roosters. This would mean reimplementing methods in Bird and Chicken
    classes.
    
4. Can you model a parrot? We are specifically interested in three parrots, one that
   lived in a house with dogs one in a house with cats, the other lived on a farm next to
   the rooster.
   * A parrot living with dogs says: “Woof, woof”
   * A parrot living with cats says: “Meow”
   * A parrot living near the rooster says: “Cock-a-doodle-doo”
   * How do you keep the parrot maintainable? What if we need another parrot
   lives near a Duck? Or near a phone that rings frequently?
   > - Created a Parrot with private constructors and static method getParrotThatLivesWith, which accepts any class 
   that implements MakesSound interface.
   > - This would allow us to create parrots that make various sounds without having to extend or make changes to 
   the class itself.
   > - Downside of this is that an instance of a class is required to create a Parrot. If we don't want to create a 
   new Dog, Cat or Rooster - then we could consider passing a sound to the parrot while instantiating it (with constructor)
   or making the sound as a static variable in the classes and accessing it when creating a Parrot class.
  
5. In addition to the birds, can you model a fish?
    * Fishes don’t sing
    * Fishes don’t walk
    * Fishes can swim
    > - Created a new interface for Swimming Animals.
    > - Created a Fish class with unit tests.
    
6. Can you specialize the fish as a Shark and as a Clownfish?
   * Sharks are large and grey
   * Clownfish are small and colourful (orange)
   * Clownfish make jokes
   * Sharks eat other fish
   > - Implemented Shark and Clownfish class as a sub-class of Fish.
   > - Implemented unit tests.
   
7. Dolphins are not exactly fish, yet, they are good swimmers
   * Can you model a dolphin that swims without inheriting from a fish class?
   * How do you avoid duplicating code or introducing unneeded overhead
   > - Implemented Dolphin class be implementing SwimmingAnimal Interface instead of extending from Fish.
   
8. Can you model a butterfly?
   * A butterfly can fly
   * A butterfly does not make a sound
   > - Implemented Butterfly class with simple unit tests.
   
9. Can you optimize your model to account for the metamorphosis from caterpillar to
   butterfly?
   * A caterpillar cannot fly
   * A caterpillar can walk (crawl)
   > - Implemented a Caterpillar Class with simple unit tests.
   > - Implemented metamorphize method which returns a Butterfly.
   
10. Can you share the code to count:
    * how many of these animals can fly?
    * how many of these animals can walk?
    * how many of these animals can sing?
    * how many of these animals can swim?
    > - Implemented in Solution class.
    
11. Can you add a second language (if you know a language other than English) Use the
    rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
    differently depending on language. Please add the rooster sound in your native
    tongue.
    > - Implemented a simple SoundTranslator class that can translate a Rooster Sound from English to French using Resource Bundle.
    > - This can be extended to other languages assuming we have a resource bundle or a backend service or a lookup table.