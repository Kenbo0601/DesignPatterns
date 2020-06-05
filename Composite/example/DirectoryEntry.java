import java.util.stream.IntStream;

abstract class DirectoryEntry {
    public void print(int level) {
        IntStream.range(0,level).forEach(x -> System.out.print("- "));
    }
}
