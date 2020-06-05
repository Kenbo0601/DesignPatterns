import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends DirectoryEntry {
    private ArrayList<DirectoryEntry> array = new ArrayList<>();
    private String name = null;

    public Directory(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void add(DirectoryEntry entry) {
        array.add(entry);
    }

    public void print(int level) {
        super.print(level);
        System.out.println(getName());
        for(DirectoryEntry dir : array)
            dir.print(level+1);
    }
}
