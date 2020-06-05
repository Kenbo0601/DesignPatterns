public class CloneFactory {
    //Recieves any Animal, or Animal subclass and 
    //makes a copy of it and stores it in its own location in memory
    //
    //CloneFactory has no idea what these objects are
    //except that they are subclasses of Animal
    
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
