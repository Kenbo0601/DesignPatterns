public class File extends DirectoryEntry {
    private String name = null;
    public File(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void print(int level) {
        super.print(level);
        System.out.println(getName());
    }
}
