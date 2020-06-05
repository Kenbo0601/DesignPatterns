import java.util.Stack;

class Pool {
    //private constructor
    private Pool() { /*singleton*/}

    private static Stack<MyObject> store = new Stack<>();

    static MyObject getObject() { 
        if(store.empty())
            return new MyObject();
        else
            return store.pop();
    }

    static void returnObject(MyObject obj) { store.push(obj); }
}