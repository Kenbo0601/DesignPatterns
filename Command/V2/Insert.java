class Insert extends CommandIF {
    int position;
    char character;
    Insert(int position, char character) {
        this.position = position; this.character = character;
    }
    void execute(StringBuffer buffer) { buffer.insert(position, character); }
    void undo(StringBuffer buffer) { buffer.deleteCharAt(position); }    
}
