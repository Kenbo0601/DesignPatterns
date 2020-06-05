import java.util.Iterator;

class Main {
    public static void main(String [] ignore) {
        //create lined list
        List<String> myList = new List<>();
        
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
    
        //foreach loop
        //these two loops are equivalent
        for(String string : myList)
            System.out.println(string);

        for(Iterator<String>itr = myList.iterator(); itr.hasNext();) {
            System.out.println(itr.next());
        }
    }
}
