//Abstract loadable class
abstract class MediaIF {
    EnvironmentIF environment;
    //allows instances of subclasses of AbstractLoadableClass to be
    //passed a reference to an instance of a class that implements
    //the EnvironmentIF interface.
    //the purpose of this method is to allow AbstractLoadableClass
    //objects to call the methods of an Environment object
    void setEnvironment(EnvironmentIF environment){ 
        this.environment = environment; 
    }
    abstract void render();
}
