import java.util.stream.IntStream;

abstract class Unit {
    String name;
    Unit(String name) { this.name = name; }
    public String toString() { return name; }
    abstract<T,U> T accept(Visitor<T,U> visitor, U data);
}
