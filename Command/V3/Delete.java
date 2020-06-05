class Delete extends CommandIF {
    int position;
    char character;
    Delete(int position) { this.position = position; }
    void execute(StringBuffer buffer) {
        character = buffer.charAt(position);
        buffer.deleteCharAt(position);
    }
    void undo(StringBuffer buffer) { buffer.insert(position, character); }
}
