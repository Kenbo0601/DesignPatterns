public class Main {
    public static void main(String [] ignore) {
        //Handles routing makeCopy method calls to the right
        //subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        //Creates a new Sheep instance
        Sheep sally = new Sheep();
        
        //Creates a clone of Sally and stores it in its own 
        //memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        //these are exact copies of each other
        
        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}
