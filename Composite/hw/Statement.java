import java.io.*;

public abstract class Statement {
    public abstract void print(PrintStream out, int indent);
    public void leaders(PrintStream out, int indent) {
        out.println();
        for(int i = 0; i < indent; i++)
            out.print(" ");
    }
}
