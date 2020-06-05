import java.util.Hashtable;

class Caretaker {
    Hashtable<String, Object> store = new Hashtable<>();
    void save(String key, Object object) {
        //check not in already
        //will not compile ((subject.Memento) object).data[2] = 4;
        store.put(key, object);
    }

    Object restore(String key) {
        //check is in already
        return store.get(key);
    }
}
