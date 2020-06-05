//By making this class cloneable you are telling java that 
//it is ok to copy instances of this class 
//these instance copies have different results when 
//System.identityHashCode(System.identityHashCode(bike)) is called

public interface Animal extends Cloneable {
    public Animal makeCopy();
}
