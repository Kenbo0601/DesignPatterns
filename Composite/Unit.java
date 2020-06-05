import java.util.stream.IntStream;

abstract class Unit {
    String name;
    Unit(String name) { this.name = name; }
    public String toString() { return name; }
    void pp(int level) {
        IntStream.range(0,level).forEach(x -> System.out.print("- "));
    }
}