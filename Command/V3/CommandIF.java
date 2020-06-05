abstract class CommandIF {
    abstract void execute(StringBuffer buffer);
    abstract void undo(StringBuffer buffer);
}
