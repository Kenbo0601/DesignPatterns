public class Sheep implements Animal {

    //Constructor
    public Sheep() {
        System.out.println("Sheep is made.");
    }

    public Animal makeCopy() {
        System.out.println("Sheep is Being Made.");
        Sheep sheepObj = null;

        try {
            //calls the Animal super classes clone()
            //then casts the results to Sheep
            sheepObj = (Sheep) super.clone();
        }
        //if Animal did not extend Cloneable this error is thrown
        catch(CloneNotSupportedException e) {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }

        return sheepObj;
    }

    public String toString() {
        return "Dolly is my Hero, Baaaaa";
    }
}
