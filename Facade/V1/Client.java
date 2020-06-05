class Client {
    public static void main(String [] ignore) {
        BinTree aleaf = new Leaf();
        aleaf = aleaf.insert(5);
        // aleaf.pp(0);

        BinTree nosearch = new Branch(4, new Branch(8, new Leaf(), new Leaf()), new Leaf());
        nosearch.pp(0);
    }
}
