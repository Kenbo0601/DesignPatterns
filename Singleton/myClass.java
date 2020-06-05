//Antipattern
class myClass {
    private static int counter = 0;

    myClass(){
        counter++;
        if(counter > 1)
            System.out.println("You cannot make a second object");
    }
}
