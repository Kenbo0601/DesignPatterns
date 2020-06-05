class Client {
    public static void main(String [] ignore) {
        BinSearchTree aleaf = new BinSearchTree();
        aleaf.insert(5);
        // aleaf.pp(0);

        BinSearchTree search = new BinSearchTree();
        search.insert(4).insert(8).insert(2).insert(3).insert(7);
        search.pp(0);
    }
}
